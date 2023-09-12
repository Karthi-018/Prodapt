import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'powerof'
})
export class PowerofPipe implements PipeTransform {

  transform(value: any, ...pwr: any):any {

    console.log(value)
    console.log(pwr)

    if(value=='')
    return value;
    else
    return value ** pwr;
  }

}
