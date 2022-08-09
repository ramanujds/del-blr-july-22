var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    //  private personName:string;
    //  private age:number;
    //  private email:string;
    //  constructor(personName:string, age:number, email:string){
    //     this.personName=personName;
    //     this.age=age;
    //     this.email=email;
    //  }
    function Person(personName, age, email) {
        if (personName === void 0) { personName = 'Karan'; }
        this.personName = personName;
        this.age = age;
        this.email = email;
    }
    return Person;
}());
// let p1:Person = new Person();
// console.log(p1)
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee(personName, age, email, salary) {
        if (personName === void 0) { personName = 'Karan'; }
        var _this = _super.call(this, personName, age, email) || this;
        _this.salary = salary;
        return _this;
    }
    Employee.prototype.showPersonInfo = function () {
        console.log("Name : " + this.personName);
        console.log("Age : " + this.age);
        console.log("Email : " + this.email);
        console.log("Salary : " + this.salary);
    };
    return Employee;
}(Person));
var p1 = new Employee('Javed', 28, 'javed@yahoo.com', 65200.0);
p1.showPersonInfo();
