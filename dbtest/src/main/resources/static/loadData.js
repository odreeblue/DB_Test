
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
                let tableArea = document.getElementById('tableArea');
                
                let new_table = document.createElement('table');
                new_table.className = "table table-striped";
                
                let new_tr = document.createElement('tr');

                let new_th = document.createElement('th');
                new_th.innerText="ID";



                for(let i=0; i<res.md_list.length;i++){
                    tableArea.appendChild(new_table);
                }
                
                

            },
            error : function(){
                console.log("실패");
            }
        });
    });
});



