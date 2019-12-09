class student {
   constructor(
        public name : string,
        public age : number,
        public marks : number,
        public degree ?: string)//optional variable degree and it should be last variable in the declarartion
        {

        }
    // printDetails(){
    //     console.log(`name is ${this.name} age is ${this.age} and marks are ${this.marks}`);
    // }
    }
    let student1 = new student('pournima',21,88);
    console.log(student1)
   // student1.printDetails();

    let student2 : student = {
        name: 'punam' ,
        age : 22 ,
        marks : 88.23 ,
        degree : 'B.tech'
    }
    console.log(student2)
    

    let students : student[] = [
        new student('abhishek',22,88),
        new student('shubham',21,88.11),

    ]
    for (let student of students) {
        console.log(student)
    }

