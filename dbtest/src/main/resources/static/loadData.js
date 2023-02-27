
var count = 1;
setInterval(function(){
document.querySelector(".sr-only").textContent = count;
    if (count >= 5){
        count = 0;
    }count++;},1000);


var module_list = ["Cooling Water", "Engine", "Cylinders","Exhaust Gas", "Fuel Oil",
    "Gearbox Oil", "Generator", "Lub.Oil","Cabinet C.Water1", "Cabinet C.Water2",
    "Convertor1","Convertor2","Main Shaft", "Motor1", "Motor2",
    "VSD M1 Status","VSD M2 Status","Cooling","Eng. and Gen.","Exhaust",
    "Lub. and Gear","VSD M1","VSD M2","Gen. Status","BUS Status",
    "MP Status","Generator Bus","MP Power","Common","Gen Alarm",
    "Blackout","Emergency Stop","Bus Alarm"];

var dt;

var modules = document.querySelectorAll('input[type="checkbox"]');
modules.forEach(function(module){
    module.addEventListener('change',function(event){
        var params = {}
        modules.forEach((checkbox,index) =>{
        if(checkbox.checked == true){
            var module_index = String(index+1);
            var name = document.querySelector('label[id="'+module_index+'"]');
            params[name.id] = module_index;
            console.log(name.id);
        }});
        console.log(params);
        $.ajax({
            type:"post",
            url:"/data2",
            contentType :"application/json",
            data: JSON.stringify(params),
            success : function(res){
                dt = res;
                console.log("성공");
                console.log("반환된 객체의 길이: "+res.length);
                // for(let i =0; i< res.md_list.length;i++){
                //     console.log(res.md_list[i]);
                // }
                
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
                
                //for(let i=0;i<res.md_list.length;i++){
                for(let i=0;i<1;i++){
                    let tableArea = createTableArea(res);
                    Area.appendChild(tableArea);
                }
            },
            error : function(){
                console.log("실패");
            }
        });
    });
});
function createTableArea(data){
    let tableArea = document.createElement('div');
    tableArea.className = "row";
    tableArea.style="weight=100px; height:200px; overflow:auto";
    tableArea.id = "tableArea";
    var table = createTable(data);
    tableArea.appendChild(table);
    return tableArea;
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

