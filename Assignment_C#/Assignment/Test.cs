using System;
using System.Collections.Generic;
using System.Text;

namespace Assignment
{
    class Test
    {
        static void Main(string[] args)
        {
            List<IInfor> listInfor = new List<IInfor>();

            People people = new People("Nam",24,"Hai Duong");
            Car car = new Car("Novo", "Xam");

            listInfor.Add(people);
            listInfor.Add(car);

            showInfor(listInfor);
        }

        public static void showInfor(List<IInfor> a)
        {
            for (int i = 0; i < a.Count; i++)
            {
                a[i].showInfor();
            }
        }
    }
}
