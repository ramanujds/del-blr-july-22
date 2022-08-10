import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'shorten'
})
export class ShortenPipe implements PipeTransform {

  transform(value: any, ...args: unknown[]): string {

      let personName = value;
      let arr = personName.split(' ');
      if(arr.length>1){
        personName = arr[0].charAt(0)+'. '+arr[1];
      }
      return personName;

  }

}
