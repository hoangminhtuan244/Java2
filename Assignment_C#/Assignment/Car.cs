using System;
using System.Collections.Generic;
using System.Text;

namespace Assignment
{
    class Car : IInfor
    {
        public string ten { get; set; }
        public string mau { get; set; }

        public Car() { }

        public Car(string ten, string mau)
        {
            this.ten = ten;
            this.mau = mau;
        }

        public void input()
        {
            Console.WriteLine("Nhap ten xe : ");
            this.ten = Console.ReadLine();

            Console.WriteLine("Nhap mau xe: ");
            this.mau = Console.ReadLine();
        }

        public void showInfor()
        {
            Console.WriteLine("Ten xe : {0} Mau xe : {1}", ten, mau);
        }
    }
}
