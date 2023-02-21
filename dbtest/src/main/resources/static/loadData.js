
//var sys_1OR2_module = ["Cooling Water", "Engine", "Cylinders","Exhaust Gas", "Fuel Oil",
//                        "Gearbox Oil", "Generator", "Lub.Oil","---"];
//var sys_3OR4_module = ["Cabinet C.Water1", "Cabinet C.Water2", "Convertor1","Convertor2",
//                        "Main Shaft", "Motor1", "Motor2", "VSD M1 Status","VSD M2 Status"];
var module_list = ["Cooling Water", "Engine", "Cylinders","Exhaust Gas", "Fuel Oil",
                   "Gearbox Oil", "Generator", "Lub.Oil","Cabinet C.Water1", "Cabinet C.Water2",
                   "Convertor1","Convertor2","Main Shaft", "Motor1", "Motor2",
                   "VSD M1 Status","VSD M2 Status","Cooling","Eng. and Gen.","Exhaust",
                   "Lub. and Gear","VSD M1","VSD M2","Gen. Status","BUS Status",
                   "MP Status","Generator Bus","MP Power","Common","Gen Alarm",
                   "Blackout","Emergency Stop","Bus Alarm"];
//var radios = document.querySelectorAll('input[type="radio"][name="systemID"]');
//var modules = document.querySelectorAll('li');
//let stri = '<input class=\"form-check-input me-1\" type=\"checkbox\" value=\"\" aria-label=\"...\">'
//radios.forEach(function(radio){
//    radio.addEventListener('change',function(event){
//        if(event.target.id=='sys1' || event.target.id=='sys2'){
//            modules.forEach(function(module,index){
//                module.innerHTML=stri+sys_1OR2_module[index];
//            });
//        }else{
//            modules.forEach(function(module,index){
//                module.innerHTML=stri+sys_3OR4_module[index];
//        });
//        }
//    });
//});

var count = 1;
//setInterval(() => console.log(new Date()), 2000);
setInterval(function(){
document.querySelector(".sr-only").textContent = count;
if (count >= 5){
count = 0;
}
count++;

}
,1000);



var modules = document.querySelectorAll('input[type="checkbox"]');
modules.forEach(function(module){
    module.addEventListener('change',function(event){
          modules.forEach((checkbox,index) =>{

            var list = [];
            if(checkbox.checked == true){
                var module_index = String(index+1);
                var name = document.querySelector('label[id="'+module_index+'"]');
                //console.log(typeof(name));
                //console.log(name.id);
                list.push(parseInt(name.id));
            }

            var params = {
                name : "chanyeong",
                age: 23

            };
            var jsonparams=JSON.stringify(params);

            $.ajax({
                type:"post",
                url:"/data",
                dataType:"json",
                contentType :   "application/json; charset=UTF-8",
                data:jsonparams,
                //contentType:"application/json; charset=utf-8",

                success : function(res){ // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
                                    // 응답코드 > 0000
                    alert(res.code);
                         },
//                error : function(XMLHttpRequest, textStatus, errorThrown){ // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
//                    alert("통신 실패.")
//                         }

            });


//            console.log(index);

          });
    });
});