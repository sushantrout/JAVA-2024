import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ellipses',
  standalone: true
})
export class EllipsesPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return value ? (value as string).slice(0, args[0] as number) + '...' : ''; // 10 is the number of characters to show
  }

}
