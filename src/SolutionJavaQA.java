public class SolutionJavaQA {

    {

        /*********************************** Questions/Answers **************************************************/
        /* Q1: int i1 = 5;
         *     int i2 = 2;
         *     int i3 = i1 / i2;
         *   Quelle est la valeur de i3 ?
         *
         *  ==> Rep1: 2
         *
         *       Choix:
         *          -> 3
         *          -> 2.5
         *          -> 2
         *          -> NaN
         */

        /*
         * Q2: Quelle signature de méthode est généralement utilisée pour obtenir un singleton ?
         *
         * ==> Rep2: getInstance()
         *
         *      Choix:
         *          -> getSingleton()
         *          -> instance()
         *          -> getInstance()
         * */

        /*
         * Q3: Quelle déclaration est une constante valide en Java ?
         *
         * ==> Rep3: public static final int MAXSIZE = 100;
         *
         *     Choix:
         *         -> define("MAXSIZE", 100);
         *         -> #define MAXSIZE 100
         *         -> public static final int MAXSIZE = 100;
         *         -> const int MAXSIZE = 100;
         * */

        /*
         * Q4: Quelle méthode est appelée lorsqu'un thread est exécuté ?
         *
         * ==> Rep4: run
         *
         *      Choix:
         *          -> do
         *          -> run
         *          -> exec
         *          -> execute
         *          -> play
         * */

        /*
         * Q5:   String s;
         *       Quelle est la valeur de s ?
         *
         * ==> Rep5: null
         *
         *       Choix:
         *          -> ""
         *          -> null
         *          -> "\0"
         * */

        /*
         * Q6: Un attribut privé est visible depuis les sous-classes.
         *
         * ==> Rep6: Faux
         * */

        /*
         * Q7: Déclarer une classe sans niveau d'accès explicite est en général conseillé.
         *
         * ==> Rep7: Faux
         * */

        /*
         * Q8: Les abstractions ne doivent pas dépendre de détails. Les détails doivent dépendre d'abstractions.
         *
         * ==> Rep8: Vrai
         * */

        /*
         * Q9: Vous réalisez une bibliothèque en Java.
         * Parmi ces options, laquelle privilégiez-vous pour traiter un comportement inattendu ?
         *
         * ==> Rep9: throw new ComportementInattenduException()
         *
         *      Choix:
         *         -> throw new ComportementInattenduException()
         *         -> System.exit(-1);
         *         -> System.err.println("Erreur: Comportement inattendu")
         *         -> return false
         * */

    /*
    * Q10: Complétez la réponse pour rendre le bout de code suivant valide:
    *      A a = new A();
    *      A b = new B()
    *
    * ==> Rep10:
              class A {}
              class B extends A {}
    * */

        /*
         * Q11:      public interface A extends B, C, D {}
         *           Cette interface est correcte si B, C et D sont également des interfaces.
         *
         *  ==> Rep11: Vrai
         * */

        /*
         * Q12: Le garbage collector garanti qu'il y a suffisamment de mémoire pour exécuter un programme Java.
         *
         * ==> Rep12: Faux
         * */

        /*
         * Q13: Quel est le résultat de l'opération 2 >> 1 ?
         *
         * ==> Rep13: 1
         *
         *     Choix:
         *         -> 0
         *         -> 1
         *         -> 2
         *         -> 3
         *         -> 4
         *
         * >> : Signed right shift
         * Example: 2>>1 (0b10>>1 ==> 1) 7>>1 (0b111>>1 ==> 0b11 : 3) 9>>1 (0b1001>>1 ==> 0b100 :4)
         * */

        /*
         * Q14: Parmi ces types primitifs, le(s)quel(s) existe en Java ?
         *
         * ==> Rep14: int, float
         *
         *     Choix:
         *         -> int
         *         -> bool
         *         -> float
         *         -> uint
         * */

        /*
         * Q15: enum Planet {
         *        MERCURY, VENUS, EARTH
         *     }
         * En considérant le code ci-dessus, quelles affirmations sont correctes ?
         *
         * ==> Rep15 :  -> Planet.MERCURY == Planet.MERCURY est vraie
         *              -> Planet.MERCURY.equals(Planet.MERCURY) est vraie
         *
         *      Choix:
         *        -> Planet.MERCURY == Planet.MERCURY est vraie
         *        -> Planet.MERCURY == Planet.VENUS est vraie
         *        -> Planet.MERCURY.equals(Planet.MERCURY) est vraie
         * */

        /*
         * Q16: En Java 8, les interfaces peuvent contenir des méthodes implémentées
         *
         * ==> Rep19: Vrai
         * */

        /*
         * Q17:   ArrayList l = new ArrayList(2);
         *        l.add(1);
         *        l.add(1);
         *        l.add(1);
         *   Quelle est la valeur retournée par l.size() ?
         *
         * ==> Rep17: 3
         *
         *      Choix:
         *        -> 1
         *        -> 2
         *        -> 3
         *        -> 5
         *        -> Ce code lève une exception
         * */

        /*
         * Q18: Parmi les options suivantes, quelle classe utiliseriez-vous si vous deviez reprendre GestionUtilisateurs ?
         *
         *      Class GestionUtilisateurs{
         *
         *          // Identifiants: stocke les identifiants d'utilisateurs
         *          ArrayList<Integer> identifiants = new ArrayList<Integer>();
         *          // noms: stockeles noms d'utilisateurs
         *          ArrayList<String> noms = new ArrayList<String>();
         *
         *          void ajouter(int identifiant, String nom){
         *              identifiants.add(identifiant);
         *              noms.add(nom);
         *          }
         *
         *          String trouverNom(int identifiant){
         *             for(int i = identifiants.size()-1; i>=0; i--) {
         *                if(identifiants.get(i) == identifiant) {
         *                     return noms.get(i);
         *                }
         *             }
         *
         *            return null;
         *          }
         *        }
         *
         * ==> Rep18: HashMap
         *
         *      Choix:
         *         -> Stack
         *         -> Vector
         *         -> ArrayList
         *         -> LinkedList
         *         -> HashMap
         *         -> HashSet
         * */

        /*
         * Q19:    int i=0;
         *         System.out.println(i++);
         *  Saisissez le résultat qu'affiche ce bout de code.
         *
         * ==> Rep19: 0
         * */

        /*
         * Q20: Parmi ces déclarations de méthodes, laquelle est à privilégier ?
         *      public ArrayList getOrders();
         *      public Vector getOrders();
         *      public List getOrders();
         *
         * ==> Rep20: public List getOrders();
         *
         *      Choix:
         *         -> public ArrayList getOrders()
         *         -> public Vector getOrders()
         *         -> public List getOrders()
         * */

        /*
         * Q21:
         *     public class A {
         *         private A() {}
         *         private static class AHolder {
         *            private static final A INSTANCE = new A();
         *         }
         *         public static A getInstance() {
         *            return AHolder.INSTANCE;
         *         }
         *     }
         *  Si vous connaissez le patron de conception (design pattern) utilisé dans ce bout de code,
         *  saisissez son nom dans le champ texte (1 mot seulement).
         *
         * ==> Rep21:
         *        Singleton
         *        Singleton Pattern
         * */

        /*
         * Q22:
         *  Saisissez le nom d'une classe appartenant au package java.lang qui permet de concaténer efficacement les chaînes de caractères.
         *
         *  ==> Rep22:  -> StringBuilder
         *              -> StringBuffer
         *              -> java.lang.StringBuilder
         *              -> java.lang.StringBuffer
         * */

        /*
         * Q23:
         *  Une méthode déclarée finale est une méthode qui...
         *
         * ==> Rep23:  ne peut pas être redéfinie
         *
         *      Choix:
         *        -> ne peut pas être redéfinie
         *        -> retourne une constante
         *        -> provoque une erreur de compilation
         * */

        /*
         * Q24:
         * Parmi ces deux propositions, laquelle préférez-vous ?
         * Proposition #1 :
         *    interface CapableDeVoler {
         *       void vole();
         *    }
         *    abstract class Avion implements CapableDeVoler {}
         *    abstract class Oiseau implements CapableDeVoler {}
         * Proposition #2 :
         *    abstract class Avion {
         *       abstract void vole();
         *    }
         *   abstract class Oiseau extends Avion {}
         *
         * ==> Rep24:
         *     La proposition #1
         * */

        /*
         *  Q25: Une classe Java peut avoir plusieurs classes parentes.
         *
         *  ==> Rep25: Faux
         * */

        /*
         * Q26: En base 2 (binaire), combien font 0001 & 0001 ?
         *
         * ==> Rep26: 0001
         *
         *   Choix:
         *      0010
         *      0000
         *      0001
         * */

        /*
         *  Q27:    Partout où un objet de type T est attendu, on doit pouvoir passer un objet de type U,
         *          avec U héritant de T.
         *
         *   ==> Rep27: Vrai
         * */

        /*
         *  Q28: Tout module (package, classe, methode) doit etre ouvert aux modifications mais fermé aux extensions.
         *
         *  ==> Rep28: Faux
         * */

        /*
         * Q29: public class A {}
         *     qui est la classe parente de A?
         *
         *  ==> Rep29: Object
         *
         *       Choix:
         *          -> Root
         *          -> La classe A n'a pas de parent
         *          -> Object
         * */
    }
}
