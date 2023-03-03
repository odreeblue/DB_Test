
var count = 1;
setInterval(function(){
document.querySelector(".sr-only").textContent = count;
    if (count >= 5){
        callData();
        // count = 0;
    }
    count++;},1000);
var module_list = {
        "1":["m01","Cooling Water","sys1","sys2"],
        "2":["m02","Engine","sys1","sys2"],
        "3":["m03","Cylinders","sys1","sys2"],
        "4":["m04","Exhaust Gas","sys1","sys2"],
        "5":["m05","Fuel Oil","sys1","sys2"],
        "6":["m06","Gearbox Oil","sys1","sys2"],
        "7":["m07","Generator","sys1","sys2"],
        "8":["m08","Lub.Oil","sys1","sys2"],
        "9":["m09","Cabinet C.Water1","sys1","sys2"],
        "10":["m10","Cabinet C.Water2","sys1","sys2"],
        "11":["m11","Convertor1","sys1","sys2"],
        "12":["m12","Convertor2","sys1","sys2"],
        "13":["m13","Main Shaft","sys1","sys2"],
        "14":["m14","Motor1","sys1","sys2"],
        "15":["m15","Motor2","sys1","sys2"],
        "16":["m16","VSD M1 Status","sys1","sys2"],
        "17":["m17","VSD M2 Status","sys1","sys2"],
        "18":["m18","Cooling","sys1","sys2"],
        "19":["m19","Eng. and Gen.","sys1","sys2"],
        "20":["m20","Exhaust","sys1","sys2"],
        "21":["m21","Lub. and Gear","sys1","sys2"],
        "22":["m22","VSD M1","sys1","sys2"],
        "23":["m23","VSD M2","sys1","sys2"],
        "24":["m24","Gen. Status","sys1","sys2"],
        "25":["m25","BUS Status","sys1","sys2"],
        "26":["m26","MP Status","sys1","sys2"],
        "27":["m27","Generator Bus","sys1","sys2"],
        "28":["m28","MP Power","sys1","sys2"],
        "29":["m29","Common","sys1","sys2"],
        "30":["m30","Gen Alarm","sys1","sys2"],
        "31":["m31","Blackout","sys1","sys2"],
        "32":["m32","Emergency Stop","sys1","sys2"],
        "33":["m33","Bus Alarm"]}

function callData(event){
    var params = {}
    modules.forEach((checkbox,index) =>{
    if(checkbox.checked == true){
        var checkbox_name = checkbox.name-1;
        var syscheck = "true";
        if(document.querySelector('input[name="group'+checkbox_name+'"][value="option1"]').checked == true){
            syscheck = "true";
        }
        else{
            syscheck = "false";
        }
        var module_index = String(index+1);
        var name = document.querySelector('label[id="'+module_index+'"]');
        params[name.id] = [module_index,syscheck];
        console.log("syscheck: "+syscheck);
        console.log("name.id: "+name.id);
    }});
    console.log(params);
    $.ajax({
        type:"post",
        url:"/data2",
        contentType :"application/json",
        data: JSON.stringify(params),
        success : function(res){
            
            console.log("성공");
            //console.log("반환된 객체의 길이: "+res.length);
            var md_list = Object.keys(params);
            md_list.forEach((md)=>{
                console.log("반환된 객체"+md+"번의 크기 : "+res[module_list[md][0]].length);    
            })
            // temp //
            let Area = document.getElementById('Area');
            console.log("Area의 길이는 : "+Area.children.length);
            var count = Area.children.length;
            // Area 내 tableArea 태그를 가진 모든 엘리먼트 삭제
            for(let i=0; i<count;i++){
                console.log(i+" 번째 자손 엘리먼트 삭제");
                var target = Area.children[0];
                Area.removeChild(target);
            }                
            md_list.forEach((md)=>{
                let tableArea=createTableArea(res[module_list[md][0]],module_list[md][1]);
                Area.appendChild(tableArea);
            });
        },
        error : function(){
            console.log("실패");
        }
    });
    count=0;
}

var toggle1 = document.querySelectorAll('input[name="exampleRadios"][id="exampleRadios1"]');
toggle1.forEach((tog,num)=>{
    tog.name="group"+num;
    tog.disabled = true;
    tog.checked = true;
})
var toggle2 = document.querySelectorAll('input[name="exampleRadios"][id="exampleRadios2"]');
toggle2.forEach((tog,num)=>{
    tog.name="group"+num;
    tog.disabled = true;
})

var systems = document.querySelectorAll('input[class="form-check-input"]');
systems.forEach(function(module){
    module.addEventListener('change',callData);
});

var modules = document.querySelectorAll('input[type="checkbox"][class="custom-control-input module"]');
modules.forEach(function(module){
    module.addEventListener('change',function(event){
        //변화된 체크박스의 아이디 가져오기
        var number = module.name-1;
        var checkbox_sys1 = document.querySelector('input[name="group'+number+'"][value="option1"]');
        var checkbox_sys2 = document.querySelector('input[name="group'+number+'"][value="option2"]');
        if(module.checked == true){
            checkbox_sys1.disabled =false;
            checkbox_sys2.disabled =false;
        }
        else{
            checkbox_sys1.disabled =true;
            checkbox_sys2.disabled =true;
        }
       
        callData(event);
        
    });
});
function createTableArea(data,name){
    let outterArea = document.createElement('div');
    let data_name = document.createElement('h3');
    data_name.innerText=name;
    outterArea.appendChild(data_name); 

    let tableArea = document.createElement('div');
    tableArea.className = "row";
    tableArea.style="weight=100px; height:200px; overflow:auto";
    tableArea.id = "tableArea";
    var table = createTable(data);
    tableArea.appendChild(table);

    outterArea.appendChild(tableArea);
    return outterArea;
}

function createTable(data){
    //테이블 생성
    let table = document.createElement('table');
    table.className = "table table-bordered";
    table.setAttribute('cellpadding','20px');
    table.appendChild(createHeader(data));
    table.appendChild(createBody(data));

    return table;
}

function createHeader(data){
    // 테이블 헤드 태그 생성
    let tableHead = document.createElement('thead');
    // 테이블 행 태그 생성
    let tableRow = document.createElement('tr');
    // 테이블 헤더 태그 생성 -> 행 태그에 삽입
    //let header_list = ["ID","TITLE","WRITER_ID","CONTENT","REGDATE","HIT"];
    let header_list = [];
    header_Array = Object.keys(data[0]);
    // console.log("data[0] : "+data[0]);
    for(let i=0; i<header_Array.length;i++){
        header_list.push(header_Array[i]);
    }


    header_list.forEach((header,index)=>{
        var tableHeader = document.createElement('th');
        tableHeader.setAttribute('scope','col');
        tableHeader.innerText=header.toUpperCase();
        tableRow.appendChild(tableHeader);
    })
    // 테이블 헤드 태그에 행 태그 삽입하여 반환
    return tableHead.appendChild(tableRow);
}

function createBody(data){
    // 테이블 바디 태그 생성
    let tableBody = document.createElement('tbody');
    // 데이터 키값 배열 생성
    let header_Array = Object.keys(data[0]);
    var tableRow;
    // 테이블 행 태그 생성
    for(let i=0; i<data.length;i++){
        tableRow = document.createElement('tr');
        header_Array.forEach((header)=>{
            let tableData = document.createElement('td');
            tableData.innerText = data[i][header];
            tableRow.appendChild(tableData);
        })
        tableBody.appendChild(tableRow);
    }
    return tableBody;
}

