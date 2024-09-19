import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'unpipe',
  standalone: true
})
export class UnpipePipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return value && (value as string).length > 10? (value as string).substring(0, 10) + '...' : value;
  }

}
