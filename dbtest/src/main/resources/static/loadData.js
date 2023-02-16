
var sys_1OR2_module = ["Cooling Water", "Engine", "Cylinders","Exhaust Gas", "Fuel Oil",
                        "Gearbox Oil", "Generator", "Lub.Oil","---"];
var sys_3OR4_module = ["Cabinet C.Water1", "Cabinet C.Water2", "Convertor1","Convertor2",
                        "Main Shaft", "Motor1", "Motor2", "VSD M1 Status","VSD M2 Status"];

var radios = document.querySelectorAll('input[type="radio"][name="systemID"]');
var modules = document.querySelectorAll('li');
let stri = '<input class=\"form-check-input me-1\" type=\"checkbox\" value=\"\" aria-label=\"...\">'
radios.forEach(function(radio){
    radio.addEventListener('change',function(event){
        if(event.target.id=='sys1' || event.target.id=='sys2'){
            modules.forEach(function(module,index){
                module.innerHTML=stri+sys_1OR2_module[index];
            });
        }else{
            modules.forEach(function(module,index){
                module.innerHTML=stri+sys_3OR4_module[index];
        });
        }
    });
});

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