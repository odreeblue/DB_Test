
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
            url:"/data",
            contentType :"application/json",
            data: JSON.stringify(params),
            success : function(res){
                console.log("성공");
                for(let i =0; i< res.md_list.length;i++){
                    console.log(res.md_list[i]);
                }
                
                // temp //
                let Area = document.getElementById('Area');
                
                // Area 내 tableArea 태그를 가진 모든 엘리먼트 삭제
                let removeTable = document.createElement('div');
                removeTable.classList.add('row');

                while(Area.hasChildNodes()){
                    Area.removeChild(Area.firstChild);
                }
                

                let tableArea = createTableArea();

                Area.appendChild(tableArea);

            },
            error : function(){
                console.log("실패");
            }
        });
    });
});
function createTableArea(){
    let tableArea = document.createElement('div');
    tableArea.className = "row";
    tableArea.style="weight=100px; height:200px; overflow:auto";
    tableArea.id = "tableArea";

    tableArea.appendChild(createTable());
    return tableArea;
}

function createTable(){
    //테이블 생성
    let table = document.createElement('table');
    table.className = "table table-striped";
    table.appendChild(createHeader());

    return table;
}

function createHeader(){
    // 테이블 헤드 태그 생성
    let tableHead = document.createElement('theader');
    // 테이블 행 태그 생성
    let tableRow = document.createElement('tr');
    // 테이블 헤더 태그 생성 -> 행 태그에 삽입
    let header_list = ["ID","TITLE","WRITER_ID","CONTENT","REGDATE","HIT"];
    header_list.forEach((header,index)=>{
        var tableHeader = document.createElement('th');
        tableHeader.innerText=header;
        tableRow.appendChild(tableHeader);
    })

    // 테이블 헤드 태그에 행 태그 삽입하여 반환
    return tableHead.appendChild(tableRow);
}

