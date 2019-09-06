using System;
using System.Collections.Generic;
using System.Text;

namespace Assignment1
{
    class MonHoc
    {
        public string tenMonHoc { get; set; }
        public string maMonHoc { get; set; }

        public MonHoc() { }

        public MonHoc(string ten, string ma)
        {
            this.tenMonHoc = ten;
            this.maMonHoc = ma;
        }

        public void input()
        {
            Console.WriteLine("Nhap ten mon hoc : ");
            this.tenMonHoc = Console.ReadLine();

            Console.WriteLine("Nhap ma mon hoc : ");
            this.maMonHoc = Console.ReadLine();
        }

        public void display()
        {
            Console.WriteLine("Ten mon hoc: {0} -> Ma mon hoc: {1}", tenMonHoc, maMonHoc);
        }
    }
}
