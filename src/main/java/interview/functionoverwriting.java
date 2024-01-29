package interview;


    class Animal
    {
        void sound()

        {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal
    {
        // Overriding the sound method in the Dog subclass
        void sound()
        {
            System.out.println("Dog barks");
        }
    }

    public class functionoverwriting
    {
        public static void main(String[] args)
        {
            Animal animal = new Animal();
            Dog dog = new Dog();

            // Call the sound method of the Animal class
            animal.sound();

            // Call the overridden sound method of the Dog class
            dog.sound();
        }
    }


