import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class SolutionJavaCodingProblem {

    /************************************ Coding Problems ***********************************/
    /* Q1: A.isFoo(String param) devrait retourner true si param est égal à la chaine "foo",
     *      sinon elle devrait retourner false.
     *      Implémentez A.isFoo(String param)
     *
     * ==> Rep1:
     */
    public static boolean isFoo(String param) {
        if ("foo".equals(param)) {
            return true;
        }
        return false;
    }

    /*
    * Q2: Transformez la méthode Counter.increment() pour qu'elle supporte l'accès concurrentiel de plusieurs threads.
    *
    * ==> Rep2: Ajouter synchronized
    *
       class Counter {
           private static int count = 0;
           public static synchronized int increment() {
             count = count + 1;
             return count;
           }
         }
     */

    /*
     * Q3: A.a(int i, int j) devrait retourner true si un des arguments est égal à 1 ou si leur somme est égale à 1.
     *    Par exemple :
     *      A.a(1, 5) retourne true
     *      A.a(2, 3) retourne false
     *      A.a(-3, 4) retourne true
     *
     * ==> Rep3:
     */
    static boolean a(int i, int j) {
        if (i == 1 || j == 1 || i + j == 1) {
            return true;
        }
        return false;
    }

    /*
    * Q4: Mettez à jour le code en appliquant les règles suivantes : Si une exception est levée par s.execute() alors
    *      appeler c.rollback() et propager l'exception, sinon appeler c.commit() Dans tous les cas, c.close() doit être
    *      appelée avant de quitter la méthode a(Service s, Connection c)
    *
    * ==> Rep4:
         class A {
             // Executes the service with the given connection.
            void a(Service s, Connection c) {
                // update this code
                s.setConnection(c);
                try{
                    s.execute();
                    c.commit();
                 }catch(Exception e ){
                    c.rollback();
                    throw e;
                }finally{
                    c.close();
                }
            }
         }

        interface Service {
          void execute() throws Exception;
          void setConnection(Connection c);
        }

        interface Connection {
          void commit();
          void rollback();
          void close();
        }
    * */

    /*
     * Q5:
     *  La méthode sumRange devrait retourner la somme des entiers compris entre 10 et 100 inclusifs
     *  contenus dans le tableau passé en paramètre.
     *  Corrigez la méthode sumRange.
     *  Note : le paramètre ints n'est jamais null.
     *  ==> Rep5:
     * */
    public static int sumRange(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            int n = ints[i];
            if (n >= 10 && n <= 100) {
                sum += n;
            }
        }
        return sum;
    }

    /*
     * Q6:
     *  Implémentez la méthode closestToZero pour renvoyer l'entier du tableau ints le plus proche de zéro. S'il
     *  y a deux entiers tout aussi proches de zéro, considérez l'entier positif comme étant le plus proche de
     *  zéro (par exemple si ints contient -5 et 5, retournez 5). Si ints est null ou vide, retournez 0 (zero).
     *  Données : les entiers dans ints ont des valeurs allant de -2147483647 à 2147483647.
     *
     * ==> Rep6:
     * */
    static int closestToZero(int[] ints) {
        if (ints.length == 0 || ints == null) {
            return 0;
        }
        int T;
        int min = Integer.MAX_VALUE;
        /* Search the temperature of minimum absolute valueReads */
        for (int i = 0; i < ints.length; i++) {
            T = ints[i];
            if (Math.abs(T) < Math.abs(min) || (T == -min && T > 0)) {
                min = T;
            }
        }
        return min;
    }

    /*
     * Q7:
     *  Vous ne vous rappelez plus de l’endroit où vous avez enregistré le fichier universe-formula.
     *  La seule chose dont vous vous souvenez, c’est que vous l’avez mis quelque part dans un sous-répertoire de /tmp/documents.
     *  Implémentez la méthode "String locateUniverseFormula()" qui devra retrouver le fichier universe-formula
     *  et retourner son chemin complet (depuis la racine du système de fichiers).
     *  /tmp/documents peut contenir des sous-répertoires imbriqués les uns dans les autres et universe-formula peut se trouver
     *  dans n’importe lequel de ces sous-répertoires. Si universe-formula n’existe pas, alors votre programme devra retourner null.
     *  Exemple :
     *   locateUniverseFormula() retourne /tmp/documents/a/b/c/universe-formula si universe-formula est trouvé dans le répertoire
     *      /tmp/documents/a/b/c.
     *
     *  ==> Rep7:
     * */
    static String locateUniverseFormula() {
        String path = "/tmp/documents/";
        // String path = "C:\\Users\\DELL-ALLOUM\\AppData\\Local\\Temp\\documents";
        String fName = "universe-formula";
        File file = find(path, fName);
        return file.getAbsolutePath();
    }

    public static File find(String path, String fName) {
        File f = new File(path);
        if (fName.equalsIgnoreCase(f.getName()))
            return f;
        if (f.isDirectory()) {
            for (String aChild : f.list()) {
                File ff = find(path + File.separator + aChild, fName);
                if (ff != null)
                    return ff;
            }
        }
        return null;
    }

    /*
     * Q8:
     *  StringUtils.concat(String[] strings) sert à joindre des chaînes de caractères bout à bout.
     *  Par exemple, à partir d'un tableau contenant "f", "o", "o", "bar", concat devrait retourner "foobar".
     *  Données : strings contient toujours au moins un élément.
     *  Implémentez StringUtils.concat(String[] strings).
     *
     * ==> Rep8:
     * */
    public static String concat(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    /*
     * Q9:
     *  Implémentez la méthode Algorithm.findLargest(int[] numbers) afin qu'elle retourne le plus grand nombre dans numbers.
     *  Note : Le tableau contient toujours au moins un nombre.
     *
     * ==> Rep9:
     * */
    static int findLargest(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    /*
     * Q10:
     *  console> java Echo Hello you !
     *           Hello
     *           you
     *           !
     *  console>
     *  Écrivez le programme Echo.
     *
     * ==> Rep10:
            class Echo {
                  public static void main(String[] args){
                      for( String str : args ){
                         System.out.println(str);
                      }
                  }
             }
     * */

    /*
     * Q11:
     * Écrivez le corps de la méthode calc(array, n1, n2). array est un tableau d'entiers.
     * Les paramètres n1 et n2 sont des entiers définis par la relation 0 <= n1 <= n2 < array.length.
     * La méthode calc doit retourner la somme des entiers de array dont l'index appartient à l'intervalle [n1;n2].
     *
     * ==> Rep11: */
    public static int calc(int[] array, int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += array[i];
        }
        return sum;
    }

    /*
     * Q12:
     *     StreamPrinter.print(Reader reader) n'est pas robuste.
     *     Améliorez StreamPrinter.print(Reader reader).
     *
     * ==> Rep12:
     * */
    public static void print(Reader reader) throws IOException {
        try {
            int code = reader.read();
            while (code != -1) {
                System.out.print((char) code);
                code = reader.read();
            }
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * Q13:
     *  AsciiArt.printChar permet d'afficher un et un seul caractère ASCII de A à Z (inclusif) sur plusieurs lignes et colonnes.
     *  Maintenant, on souhaite faire l'opération dans l'autre sens : obtenir un caractère à partir de sa représentation graphique.
     *  Implémentez la méthode scanChar(String s) afin qu'elle retourne le caractère associé à la représentation
     *  graphique fournie par AsciiArt.printChar(char c).
     * Si s ne correspond pas à un caractère entre A et Z (inclusif), alors scanChar devra retourner le caractère ?
     *
     * ==> Rep13:
     * */
    static char scanChar(String s) {
        // Iterate over each character from A to Z.
        for (char c = 'a'; c <= 'z'; c++) {
            // Check to see if the character corresponds with the ASCII art.
            if (printChar(c).equals(s)) {
                // Return the character if it does.
                return c;
            }
        }
        // Optionally use a null character to indicate that the string passed
        // doesn't correspond to any valid ASCII art.
        return (char) 0;
    }

    static String printChar(char c) {
        return "S";
    }

    /*
     * Q14:
     *
     * Vous organisez un tournoi d’échecs dans lequel les joueurs s'affronteront en duel.
     * Pour former les duels on procède ainsi : d'abord on tire au hasard un joueur, ensuite on tire au hasard
     * son opposant parmi les joueurs restants. Cette paire forme un des duels du tournoi.
     * On procède de la même manière pour former toutes les paires.
     * Dans cet exercice, on souhaiterait connaître le nombre de paires qu'il est possible d'obtenir sachant
     * que l'ordre des opposants dans une paire n'a pas d'importance.
     * Par exemple, avec 4 joueurs nommés A, B, C et D, il est possible d'obtenir 6 paires différentes :
     * AB, AC, AD, BC, BD, CD.
     * Implémentez count pour retourner le nombre de paires possibles. Le paramètre n correspond au nombre de joueurs.
     * Essayez d'optimiser votre solution pour que, dans l'idéal, la durée de traitement soit la même quel que soit n.
     * Données : 2 <= n <= 10000
     *
     * ==> Rep14:
     * */
    static int count(int n) {
        if (n < 2 || n > 10000) {
            return 0;
        }
        return n * (n - 1) / 2;
    }

    /*
     * Q15:
     *
     * Un arbre est composé de noeuds qui respectent les règles suivantes :
     *    Un noeud tient une valeur correspondant à un entier.
     *    Hormis le noeud à la racine de l’arbre, un noeud a toujours un seul autre noeud qui le référence.
     *    Un noeud n’a pas plus de deux enfants, appelés noeud à gauche et noeud à droite.
     *    Si un noeud n’a pas d’enfant à droite ou à gauche, alors la référence correspondante est null.
     * La valeur tenue par tout enfant du sous arbre à gauche est inférieure à la valeur de son parent et la valeur
     * tenue par tout enfant du sous arbre à droite est supérieure à la valeur de son parent. Voici un exemple d’
     *
     *  Fig. 1                                9
     *                                     /    \
     *                                    /      \
     *                                  7         13
     *                                /   \         \
     *                               /     \         \
     *                              5       8         17
     *                            /  \               /
     *                           /    \             /
     *                          2      6           16
     *
     * Pour simplifier le code, tout est combiné dans une simple classe nommée Node.
     * La hauteur de l’arbre (la distance entre le noeud le plus éloigné et la racine) est comprise entre 0 et 100 000 noeuds.
     * Question : Implémentez une nouvelle méthode de Node nommée find(int v) qui retourne le noeud tenant la valeur v.
     * Si ce noeud n’existe pas alors find devra retourner null.
     * Important : Essayez de privilégier un faible usage de la mémoire RAM.
     * Pour tester votre algorithme, vous pouvez vous exercer à partir de deux exemples d’arbres :
     * L’arbre présenté ci-dessus (Fig. 1) : la variable small correspond au noeud racine.
     * Un arbre d’une hauteur de 100 000 noeuds : la variable large correspond au noeud racine,
     * sachant que le noeud le plus éloigné tient la valeur 0.
     *
     * ==> Rep15:
     * */
     /*
      public class Node {
         int value;
         Node left;
         Node right;

        public Node find(int v) {
           Node current = this;
          while (current != null)
          {
             if (v > current.value) {
                 current = current.right;
             }else if (v < current.value) {
                 current = current.left;
             }else { // v == n.value
                 return current;
             }
         }
         return null;
       }
     }
     */

    /*
     * Q16:  La méthode reshape(n, str) retourne la chaine str sans les espaces et formatée
     *       en lignes de n caractères maximum.
     *  Exemples :
     *      reshape(3, "abc de fghij") => renvoie "abc\ndef\nghi\nj"
     *      reshape(6, "1 23 456") => renvoie "123456"
     *  Écrivez le corps de la méthode reshape(n, str).
     *
     *  ==> Rep16 :
     * */
    public static String reshape(int n, String str) {
        //replace each space with empty string
        str = str.replace(" ", "");

        //insert a '\n' character each n characters
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0 && i != 0)
                res = res + '\n' + str.charAt(i);
            else
                res += str.charAt(i);
        }
        return res;
    }

    /*
     *  Q17:
     *  Calculator.sum(String... numbers) retourne la somme des nombres appartenant au tableau numbers
     *  numbers contient toujours des nombres flottant valides exprimés sous la forme de chaine de caractères
     *  l'implementation actuelle retourne parfois un résultat inexact,
     *  Par Exemple:
     *  Calculator.sum("99.35","1.10") retourne 100.449999999999999
     *  Modifiez la méthode Calculator.sum(String... numbers) afin qu'elle retourne toujours la somme exacte
     *
     *  ==> Rep17:
     * */
    static String sum(String... numbers) {
        BigDecimal total = new BigDecimal(0);
        for (String number : numbers) {
            total = total.add(new BigDecimal(number));
        }
        return String.valueOf(total);
    }

    /*
     * Q18:
     *  Un nombre premier est un entier naturel plus grand que 1
     *  qui n'a aucun diviseur positif autre que 1 ou lui meme.
     *  Completer la méthode IsPrime(int n) qui retourne true si n est premier ou false sinon
     *
     *  ==> Rep18:
     * */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Q19:
     * Le Programme se déroule comme suit: on commence par créer une partie(Game) en fonction d'un nombre
     * strictement positif de joueurs et de cartes à distribuer.
     * Le jeu démarre via l'appel à la methode start() qui mélange le paquet(Deck) de cartes puis
     * les distribue à chaque joueur.
     *
     * Pour simuler la distribution des cartes, vous devez compléter le code ainsi:
     *    ==> Player.cards: choisir le type de collection
     *    ==> Game.newListPlayer(): renvoyer une nouvelle liste de joueurs
     *    ==> Game.distributeCardsEvenlyToPlayer(): distribuer le plus de cartes possible à chaque joueur.
     *          Tous les joueurs doivent finir avec le meme nombre de cartes en main.
     *    ==> Player.addCard(): donner une carte à un joueur en l'ajoutant à sa liste triée de cartes(Cards)
     *
     *  Les cartes d'un joueur doivent etre en permanence triées ainsi:
     *    ==> Par couleur: Pique(Spade) puis Carreau(Diamond) puis Trèfle(Club) puis coeur(Heart)
     *    ==> Puis par valeur: 2(Two) puis 3(Three) puis 4(Four) puis 5(Five) puis 6(six) puis 7(seven)
     *                         puis 8(Eight) puis 9(Nine) puis 10(Ten) puis Valet(jack) puis
     *                         Dame(Queen) puis Roi(King) puis As(Ace)
     *  Attention, le Deck pouvant contenir certaines cartes en double, un meme joueur ne doit en aucun cas
     *  accepter une carte deja en sa possession
     *
     *  La gestionde toutes les erreurs se fera levant une exception de type GameException
     *
     * ==> Rep19:
     * */
    // https://codereview.stackexchange.com/questions/208644/cards-shuffling-and-dealing-program
    // import java.util.*;
    enum CardColor {
        Spade, Diamond, Club, Heart
    }

    enum CardValue {
        Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
    }

    static class GameException extends RuntimeException {
    }

    static class Card implements Comparable<Card> {
        public final CardColor color;
        public final CardValue value;

        public Card(CardColor cardColor, CardValue cardValue) {
            color = cardColor;
            value = cardValue;
        }

        public CardColor getCardColor() {
            return this.color;
        }

        public CardValue getCardValue() {
            return this.value;
        }

        @Override
        public int compareTo(Card card) {
            return Comparator.comparing(Card::getCardColor)
                    .thenComparing(Card::getCardValue)
                    .compare(this, card);
        }
    }

    static class Deck {
        public ArrayList<Card> cards;

        public int getCardsCount() {
            return cards == null ? 0 : cards.size();
        }

        public Deck(int cardsCount) {
            if (cardsCount % 4 != 0)
                throw new GameException();
            cards = new ArrayList<>(cardsCount);
            addCards(cardsCount);
        }

        private void addCards(int cardsToAdd) {
            int cardsAdded = 0;
            while (cardsAdded < cardsToAdd)
                for (CardColor cardColor : CardColor.values())
                    for (CardValue cardValue : CardValue.values()) {
                        if (cardsAdded >= cardsToAdd)
                            break;
                        cards.add(new Card(cardColor, cardValue));
                        ++cardsAdded;
                    }
        }

        public void shuffle() {
            Collections.shuffle(cards);
        }
    }

    static class Player {
        private String _name;
        public Set<Card> cards = new TreeSet<Card>();

        public int getCardsCount() {
            return cards == null ? 0 : cards.size();
        }

        public Player(String name) {
            _name = name;
        }

        public void addCard(Card card) {
            if (cards.contains(card)) {
                throw new GameException();
            }
            cards.add(card);
        }
    }

    static class Game {
        private int _cardsCount;
        private int _playersCount;
        public Deck deck;
        public List<Player> players;

        public int getPlayersCount() {
            return players == null ? 0 : players.size();
        }

        public Game(int playersCount, int cardsCount) {
            _playersCount = playersCount;
            _cardsCount = cardsCount;
            players = newListPlayer(playersCount);
            deck = new Deck(cardsCount);
        }

        public void distributeCardsEventlyToPlayers() {
            for (Card card : deck.cards) {
                players.get((int) (Math.random() * 4)).addCard(card);
            }
//            for(int i = 0; i < deck.cards.size(); i+=players.size()){
//                for(int j = 0; j < players.size(); j++){
//                    players.get(j).addCard(deck.cards.get(j));
//                }
//            }
        }

        private List<Player> newListPlayer(int playersCount) {
            //List<Player> playersList = new ArrayList<Player>(playersCount);
            List<Player> playersList = new ArrayList<>();
            for (int i = 0; i < playersCount; i++) {
                Player player = new Player("Player " + i);
                playersList.add(player);
            }
            return playersList;
        }

        public void start() {
            deck.shuffle();
            distributeCardsEventlyToPlayers();
        }
    }


    /*
     *  Q20:
     *  Implement the method get(int l, int c) by finding a construction pattern from
     *  the sample bellow
     *  input  0<=c<=l<=10000                                                0  1  2  3  4  5
     *
     *  important notes:                                                 0|  1
     *    - at first try to save memory (RAM) space, next try to
     *      save CPU cycles if possible                                  1|  1  1
     *    - 64 bits are not enough to compute all results
     *                                                                   2|  1  2  1
     *  Examples
     *   get(4, 2) should return the string 6                            3|  1  3  3  1
     *   get(5, 0) should return the string 1
     *   get(67, 34) should return the string 14226520737620288370       4|  1  4  6  4  1
     *
     *                                                                   5|  1  4  10 10 5  1
     *  ==> Rep20:
     * */
    static String getPascalTriangle(int l, int c) {
        if (l == 0 || l == c) {
            return String.valueOf(1);
        } else {
            return String.valueOf(fact(l).divide(fact(c).multiply(fact(l - c))));
        }

    }

    static BigInteger fact(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    /*
     * Q21:
     *  in this exercice we will calculate an approximation of Pi
     *  The technique is as follows:
     *  Take a random point P at coordinated(x,y) such that 0<=x<=1 and 0<=y<=1 if
     *  x*x + y*y <=1 then the point is inside the quarter disk of radius 1,
     *  outherwise the point is outside.
     *
     *  We know that the probability that the point is inside the quarter disk is equal to Pi/4
     *  Write the method double.approx(double[][] pts) who will use the points pts to return
     *  an approximation of the number Pi
     *
     * ==> Rep21:
     * */
    static double approx(double[][] pts) {
        int hits = 0;
        double pi = 0.0;
        for (int i = 0; i < pts.length; i++) {
            double x = pts[i][0];
            double y = pts[i][1];
            if (x * x + y * y <= 1) {
                hits = hits + 1;
            }
        }
        pi = 4.0 * hits / pts.length;
        return pi;
    }

    /*
     * Q22:   Modify the body of some methods(this can include the body of the constructor) to protect
     *       Person instances againt alteration. Once a Person is created, it should not be possible to
     *       modify it
     *
     *  ==> Rep22 : Make Person immutable
     * */
    final class Person {
        final private String name;
        final private Date birthDate;

        public Person(String name, Date birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        public String getName() {
            return this.name;
        }

        public Date getBirthDate() {
            return this.birthDate;
        }

    }

    /*
     * Q23:
     *  Dire si l'expression donnée en entrée est bien parenthésée. Une expression est bien parenthésée
     *  si les parenthèses (), les crochets[] et les accolades{} sont correctement appairés.
     *  L'expression ne contient pas d'espaces
     *
     * Entrée ==> Une ligne de texte.
     * Sortie ==> True si les parenthèses(), crochets[] et accolades{} sont correctement appairés dans la ligne
     *            donnée, false sinon.
     *
     * Contraintes ==> Longeur de la ligne <= 2048
     *
     * ==> Rep23:
     * */
    public static boolean parse(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        // Stack<Character> stack = new Stack();
        for (char c : expression.toCharArray()) {
            switch (c) {
                case '(':
                    // cas ouvrant
                    stack.push(')');
                    break;
                case '[':
                    // cas ouvrant
                    stack.push(']');
                    break;
                case ')':
                case ']':
                    // cas fermant
                    if (stack.isEmpty() || stack.pop() != c) return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    private static void test(boolean expected, String string) {
        System.out.printf("Test sur %s: %s%n", string, parse(string) == expected ? "OK" : "KO");
    }

    /*
    * Q24:
    * Essayez d'améloirer le code affiché dans l'éditeur de réponses tout en conservant le comportement actuel du programme
    *
    * ==> Rep24:
     abstract class Animal { }

     class Dog extends Animal {
         String name;
         public Dog(String name) {
              this.name = name;
         }
         public String getName() {
              return this.name;
         }
     }

     class Cat extends Animal {
          String name;
          public Cat(String name) {
              this.name = name;
          }
          public String getName() {
              return this.name;
          }
     }

     public class Application {
          public static String getAnimalName(Animal animal) {
               if(animal instanceof Dog) {
                     return ((Dog) animal).getName();
               }else if (animal instanceof Cat) {
                     return ((Cat) animal).getName();
               }else{
                     return null;
               }
          }
          public static void main(String[] args) {
              Dog sammy = new Dog("sammy");
              Cat smokey = new Cat("smokey");
              System.out.println(Application.getAnimalName(sammy));
              System.out.println(Application.getAnimalName(smokey));
          }
     }
    */

    /*
     *  Q25:  The method computeMultiplesSum(n) should return the sum of all the positive multiple of 3 or 5 or 7 strictly below n
     *        As an example for n=11 we get 3,5,6,7,9,10 as multiples and the sum of these multiples is 40
     *        Implement computeMultiplesSum(n)
     *        Constraints: 0<= n <=1000
     *
     * ==> Rep25:
     * */
    public static int computeMultiplesSum(int n) {

        return IntStream.range(1, n)
                .filter(i -> i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                .sum();
    }

    /*
     *  Q26:
     *  It's almost the summer Sales!
     * You work for a shop that wishes to give a discount of discount% to the most expensive item purchased by a given
     * customer during the sales period.
     * You are tasked by the shop owner to implement the method calculateTotalPrice(prices, discount)() which takes the
     * list of prices of the products purchased by a customer and the percentage discount as parameters and returns the
     * total purchase price as an integer(rounded down if the total is a float number).
     *
     * Constraints:
     *     -> 0 <= discount <= 100
     *     -> 0 <= price of product < 100000
     *     -> 0 < number of products < 100
     *
     * ==> Rep26:
     * */
    public static int calculateTotalPrice(int[] price, int discount){
        // Discount = Marked Price - Selling price
        // Discount Percentage = (Discount / Marked Price) * 100
        if( price == null || discount<0 || discount> 100) return 0;
        int total = 0;
        for(int i=0; i<price.length; i++){
            total += price[i] - (price[i]*discount)/100;
        }
        return total;
    }

    /*
     * Q27: Implement computeJoinPoint
     *
     * ==> Rep27:
     * */
    static Long computeJoinPoint(long s1, long s2) {

        if (s1 <= 0 || s2 <= 0 || s1 >= 20000000 || s2 >= 20000000) {
            return null;
        }
        while (s1 != s2) {
            if (s1 < s2) {
                s1 = getNextNumber(s1);
            } else {
                s2 = getNextNumber(s2);
            }
        }
        return s1;
    }
    static long getNextNumber(long input) {

        long sumDigitsInNumber = 0;
        String inputString = input + "";

        for (int i = 0; i < inputString.length(); i++) {
            sumDigitsInNumber += Character.getNumericValue(inputString.charAt(i));
        }

        return input + sumDigitsInNumber;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("--------> Test Q1 isFoo() function");
        System.out.println(SolutionJavaCodingProblem.isFoo("foo")); // return true
        System.out.println(SolutionJavaCodingProblem.isFoo("fooazerty")); // return false

        System.out.println("--------> Test Q3 a() function");
        System.out.println(SolutionJavaCodingProblem.a(1, 5)); // true
        System.out.println(SolutionJavaCodingProblem.a(2, 3)); // false
        System.out.println(SolutionJavaCodingProblem.a(-3, 4)); // true

        System.out.println("--------> Test Q5 sumRange() function");
        System.out.println("---------> " + SolutionJavaCodingProblem.sumRange(new int[]{30, 4, 9, 12, 98, -10, 10}));

        System.out.println("--------> Test Q6 closestToZero() function");
        System.out.println("---------> " + SolutionJavaCodingProblem.closestToZero(new int[]{7, 5, 9, 1, 4}));

        System.out.println("--------> Test Q7 locateUniverseFormula() function");
        // System.out.println("--------> locateUniverseFormula : "+locateUniverseFormula());

        System.out.println("--------> Test Q8 concat() function");
        System.out.println(concat(new String[]{"f", "o", "o", "bar"}));

        System.out.println("--------> Test Q9 findLargest() function");
        System.out.println(findLargest(new int[]{30, 4, 9, 12, 98, -10, 10}));

        System.out.println("--------> Test Q11 calc() function");
        System.out.println(calc(new int[]{30, 4, 9, 12, 98, -10, 10}, 2, 6));

        System.out.println("--------> Test Q12 print() function");
        Reader reader = new InputStreamReader(new FileInputStream(new File("C:\\Users\\Utilisateur\\IdeaProjects\\aa-test\\aa-test-codingame\\universe-formula")));
        print(reader);

        System.out.println(" --------> Test Q14 count() Function");
        System.out.println(count(4));

        System.out.println("---------> Test Q16 reshape() Function");
        System.out.println(reshape(3, "abc de fghij"));
        System.out.println(reshape(6, "1 23 456"));

        System.out.println("----------> Test Q17 sum() Function");
        System.out.println(sum("99.35", "1.10"));

        System.out.println("----------> Test Q18 isPrime() Function");
        System.out.println(isPrime(1)); // FALSE
        System.out.println(isPrime(5)); // TRUE
        System.out.println(isPrime(15)); //FALSE
        System.out.println(isPrime(32)); // FALSE
        System.out.println(isPrime(67)); // TRUE

        System.out.println("----------> Test Q19 getCardsCount() | getPlayersCount() | getCardsCount() Functions ");
        int playersCount = 4;
        int cardCount = 52;
        Game game = new Game(playersCount, cardCount);
        game.start();
        System.out.println(game.deck.getCardsCount());
        System.out.println(game.getPlayersCount());
        System.out.println(game.players.get(0).getCardsCount());


        System.out.println("----------> Test Q20 getPascalTriangle() Function");
        System.out.println(getPascalTriangle(4, 2));
        System.out.println(getPascalTriangle(5, 0));
        System.out.println(getPascalTriangle(67, 34));

        System.out.println("----------> Test Q21 approx Function");
        double rands[][] = new double[1000000][2];
        for (int i = 0; i < rands.length; i++) {
            rands[i][0] = Math.random();
            rands[i][1] = Math.random();
        }
        System.out.println(approx(rands));

        System.out.println("----------> Test Q23 verification() Function");
        test(true, "[()]"); // true
        test(true, "(()[])"); // true
        test(false, "([)]"); // false
        test(false, "(("); // false
        test(false, "[(()])"); // false

        test(true, "([(([[(([]))]]))])"); // true
        test(true, "[](()()[[]]) ()[]([])"); // true
        test(false, "([((([(([]))])))))])"); // false
        test(false, "[](()()[[]])[][[([])"); // false

        System.out.println("----------> Test Q25 computeMultiplesSum() Function");
        System.out.println(computeMultiplesSum(11));
        System.out.println(computeMultiplesSum(15));
        System.out.println(computeMultiplesSum(100));

        System.out.println("----------> Test Q26 calculateTotalPrice() Function");
        System.out.println(calculateTotalPrice(new int[]{500,500,1000}, 80));

        System.out.println("----------> Test Q27 computeJoinPoint() Function");
//        Scanner scanner = new Scanner(System.in);
//        long r1 = Long.parseLong(scanner.nextLine());
//        long r2 = Long.parseLong(scanner.nextLine());
//        System.out.println(computeJoinPoint(r1, r2));
        System.out.println(computeJoinPoint(19, 7));

    }
}
