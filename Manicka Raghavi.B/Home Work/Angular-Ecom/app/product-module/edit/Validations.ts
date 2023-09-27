import { AbstractControl, ValidatorFn } from "@angular/forms";

export function StartsWithValidation(): ValidatorFn {

    return (control: AbstractControl): { [key: string]: any } | null => {
  
      const value = control.value||' ';
  
      const startsWithMr = value.startsWith("0");
  
      return startsWithMr ? { 'startsWith0': { value: control.value } } : null;
  
    };
  
  }

  export function atLeastOneFieldValidator(controlName: string, otherControlName: string): ValidatorFn {

    return (group: AbstractControl): {[key: string]: any} | null => {
  
      const control = group.get(controlName);
  
      const otherControl = group.get(otherControlName);
  
   
  
      if (!control || !otherControl) return null;
  
   
  
      if (!control.value && !otherControl.value) {
  
        return {'atLeastOneRequired': true};
  
      }
  
   
  
      return null;
  
    };
  
  }