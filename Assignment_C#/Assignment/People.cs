using System;
using System.Collections.Generic;
using System.Text;

namespace Assignment
{
    class People : IInfor
    {
        public string ten { get; set; }
        public int tuoi { get; set; }
        public string diaChi { get; set; }

        public People() {}

        public People(string ten, int tuoi, string diaChi)
        {
            this.ten = ten;
            this.tuoi = tuoi;
            this.diaChi = diaChi;
        }

        public void input()
        {
            Console.WriteLine("Nhap ten : ");
            this.ten = Console.ReadLine();

            Console.WriteLine("Nhap tuoi : ");
            this.tuoi = Int32.Parse(Console.ReadLine());

            Console.WriteLine("Nhap dia chi : ");
            this.diaChi = Console.ReadLine();
        }

        public void showInfor()
        {
            Console.WriteLine("Ten: {0} Tuoi: {1} Dia chi: {2}", ten, tuoi, diaChi);
        }
    }
}
