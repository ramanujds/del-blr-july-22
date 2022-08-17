import { AbstractControl } from "@angular/forms";

export function validateJoinDate(control:AbstractControl):{[key:string]:any}|null{

    if(!control.value){
        return null
    }

    let date:Date=new Date(control.value);
    let today=new Date();
    if(date.toISOString()>today.toISOString()){
        return {'datecheck':{value:control.value}}
    }
    return null;
}