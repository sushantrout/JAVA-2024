import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'mr', //Custom pipe name
  standalone: true //Make it standalone pipe
})
export class MrPipe implements PipeTransform { //Implementing PipeTransform interface

  transform(value: unknown, ...args: unknown[]): unknown { //value is the input value, args is the arguments passed to the pipe
    return (args[0] == 'male' ? "Mr " : "Mrs " ) + value; //args[0] is gender, args[1] is title, args[2] is salary
  }

}
