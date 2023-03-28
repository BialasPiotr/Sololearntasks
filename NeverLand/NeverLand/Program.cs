using System;

namespace Neverland
{
    class Program
    {
        static void Main(string[] args)
        {
          
            Console.Write("Enter your age when you arrived at Neverland: ");
            int myAge = int.Parse(Console.ReadLine());
            Console.Write("Enter the number of years that have passed since your twin went back: ");
            int yearsPassed = int.Parse(Console.ReadLine());
            int twinAge = myAge + yearsPassed;
            int ageDifference = twinAge - myAge;
            Console.WriteLine("My twin is {0} years old and He is {1} years older than me", twinAge, ageDifference);
            Console.WriteLine("Press any key to exit...");
            Console.ReadKey();
        }
    }
}
