import { Employee } from "./employee";

export let employees:Employee[] = [new Employee('101','AAA','8000','Training'),
                                   new Employee('102','BBB','18000','Testing'),
                                   new Employee('103','CCC','5000','HR'),
                                   new Employee('104','DDD','6000','Administrator'),
                                   new Employee('105','EEE','9000','Developer')
                                  ];
export let department:string[] = ['Training','Testing','Developer','HR','Administrator'];