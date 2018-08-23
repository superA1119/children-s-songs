/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    /**
     * sings line 1 of each verse
     * 
     */
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }


    /**
     * sings line 2 of each verse
     * 
     * @param part Type of animal to sing about in each verse
     */
    public static void hadA(String animal) 
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }


    /**
     * sings lines 3 and 4 of each verse
     * 
     * @param part Animal's sound to sing about in each verse 
     */
    public static void withA(String sound) 
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    
    /**
     * Sings the verse of old MacDonald
     * 
     * @param part animal and sound part to sing about in the verse
     */
    public static void singIt(String animal, String sound) 
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
