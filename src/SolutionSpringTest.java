public class SolutionSpringTest {
    {

        /*********************** SPRING ***********************************/
        /*
         *  Q1: Quel est le nom du protocole, basé sur du texte,
         *  utilisé par Spring pour envoyer des messages par Websockets ?
         *
         *  ==> Rep1: STOMP || Streaming Text Oriented Messaging Protocol
         * */

        /*
         *  Q2: Quelle annotation peut-on utiliser pour injecter un bean Spring ?
         *
         *  ==> Rep2: @Autowired
         *
         *    Choix:
         *       - @Autowired
         *       - @PostConstruct
         *       - @Bean
         *       - @Component
         *       - @InjectBean
         * */

        /*
         *  Q3: Quel est le nom d'un containeur Spring qui instantie, configure et manage un certain nombre de beans ?
         *
         *  ==> Rep3: BeanFactory
         *
         *   Choix:
         *      - BeanContainer
         *      - SpringContainer
         *      - BeanFactory
         *      - BeanManager
         * */

        /*
         *  Q4:   Quelle annotation Java standard est une alternative plus puissante à l'annotation
         *        plus ancienne @Secured de Spring ?
         *
         *  ==> Rep4: @PreAuthorize
         *
         *    Choix:
         *       - @PreAuthorize
         *       - @PostAuthorize
         *       - @PreFilter
         *       - @PostFilter
         * */

        /*
         *  Q5:  Vous créez un répo JPA représentant des objets Employee persistés en base de données.
         *       Vous souhaitez pouvoir appeler des méthodes fournies par Spring "out-of-the-box" pour créer,
         *      mettre à jour, effacer et lire ces objets et rien de plus.
         *      Quelle classe Spring devriez-vous étendre ?
         *
         *  ==> Rep5: CrudRepository
         *
         *       Choix:
         *          - Repository
         *          - CrudRepository
         *          - PagingAndSortingRepository
         *          - SimpleRepository
         * */

        /*
         *  Q6: Quel événement du cycle de vie de l'application n'existe pas dans Spring Framework ?
         *
         *  ==> Rep6: ContextLostEvent
         *       Choix:
         *          - ContextRefreshedEvent
         *          - ContextStartedEvent
         *          - ContextClosedEvent
         *          - ContextLostEvent
         * */

        /*
         *  Q7:   Parmi les propositions suivantes, quelles sont celles qui désignent des modules Spring ?
         *        Plusieurs réponses attendues.
         *
         *  ==> Rep7: Spring Data || Spring Web || Spring Boot
         *
         *       Choix:
         *          - Spring Data
         *          - Spring Web
         *          - Spring Desktop
         *          - Spring Boot
         * */

        /*
         * Q8:   Quelle est l'annotation Spring utilisée pour ajouter une méthode associée à une requête SQL
         *       personnalisée vers un repository JPA (XXXXXX dans le code ci-dessous) ?
         *
         *    @XXXX("select c from Car c where c.manufacturer = 'Ford'")
         *    List<Car> findAllFordCars();
         *
         *  ==> Rep8: query
         *
         *       Choix:
         *          - query
         *          - sql
         *          - autosql
         *          - select
         * */

        /*
         * Q9: Combien de constructeurs d'une classe peuvent être annotés avec @Autowired ?
         *
         *  ==> Rep9: 1 - sinon Spring ne saurait lequel choisir
         *
         *       Choix:
         *          - 0 - @Autowired n'est utilisable que sur les champs et les méthodes setXXX
         *          - 1 - sinon Spring ne saurait lequel choisir
         *          - multiple - si chacun d'eux a un @Qualifier différent
         *          - multiple - dans tous les cas
         * */

        /*
         *  Q10:  Quelle annotation de Spring Boot permet d'activer le SSO (Single Sign On)
         *        avec un provider OAuth2 déclaré au niveau de propriétés externes ?
         *        Cette annotation a été introduite par Spring Boot 2.0.0.
         *
         *   ==> Rep10: @OAuth2ClientAutoConfiguration
         *
         *        Choix:
         *          - @OAuth2ClientAutoConfiguration
         *          - @EnableOAuth2Client
         *          - @OAuth2Client
         *          - @EnableSso
         * */

        /*
         *  Q11:  Que se passe-t-il quand on demande à une BeanFactory de fournir une instance de bean
         *        pour lequel il existe de multiples candidats, alors qu'un seul bean candidat était attendu ?
         *
         *   ==> Rep11: NoUniqueBeanDefinitionException est lancé
         *
         *       Choix:
         *         - Spring choisit le premier bean qu'il trouve dans le contexte scanné
         *         - NoUniqueBeanDefinitionException est lancé
         *         - Aucun bean n'est cablé (retourne null)
         *         - Spring choisit le premier bean par ordre alphabétique
         * */

        /*
         *  Q12: On considère le code ci-dessous :
         *
         *    @Controller
         *    public class OwnerController {
         *
         *        XXXX  // ===> ligne 4
         *        public Cart getCart(@PathVariable int cartId){
         *           ...
         *        }
         *     }
         *
         *    En utilisant Spring MVC, avec quelle annotation doit-on remplacer XXX, à la ligne 4,
         *    si l'on souhaite que la méthode getCart() soit exécutée
         *    suite à un appel de l'URL /cart/{cartId} par la méthode GET ?
         *    Écrivez l'annotation complète.
         *
         *   ==> Rep12:
         *        - RequestMapping(value="/cart/{cartId}", method=RequestMethod.GET)
         *        - @RequestMapping(value="/cart/{cartId}", method=RequestMethod.GET)
         *        - RequestMapping(value="/cart/{cartId}", method = RequestMethod.GET)
         *        - @RequestMapping(value="/cart/{cartId}", method = RequestMethod.GET)
         *        - GetMapping("/cart/{cartId}")
         *        - @GetMapping("/cart/{cartId}")
         * */

        /*
         *  Q13: Quelle classe de Spring Framework utiliseriez-vous pour appeler un service Rest ?
         *
         *  ==> Rep13: RestTemplate || org.springframework.web.client.RestTemplate
         * */

        /*
         *  Q14: Observez les deux façons d'injecter un service dans un bean :
         *
         * 1:
         *   @Component
         *   public class MyService {
         *
         *     private AnotherService anotherService;
         *
         *     @Autowired
         *     public MyService(AnotherService anotherService){
         *         this.anotherService=anotherService;
         *     }
         *
         *     // Code
         *   }
         *
         *  2:
         *   public class MyService {
         *     @Autowired
         *     private AnotherService anotherService;
         *
         *     public MyService(AnotherService anotherService){
         *         this.anotherService=anotherService;
         *     }
         *     // Code
         *   }
         *
         *   Le résultat est le même pour les deux codes. Mais, y en a-t-il un qui est préférable à l'autre ?
         *
         *   ==> Rep14:  Celui par constructeur est préférable car il force le développeur à fournir
         *               le service ce qui réduit le risque de "null pointer exception"
         *
         *          Choix:
         *             - Celui par setter est préférable car il autorise le développeur à ignorer
         *               l'injection ce qui permet de prototyper plus vite
         *             - Celui par constructeur est préférable car il force le développeur à fournir
         *               le service ce qui réduit le risque de "null pointer exception"
         *             - Non, il n'y a pas de différence en pratique
         *             - Non, aucun des deux ne convient, l'injection par réflexion est la meilleure façon de procéder
         * */

        /*
         * Q15:   Un bean est annoté avec @Lazy. Quand est-il initialisé ?
         *        Plusieurs réponses attendues.
         *
         *  ==> Rep15:  - Quand il est référencé par un autre bean
         *              - Quand il est explicitement récupéré de la bean factory associée
         *
         *        Choix:
         *          - Au démarrage du containeur Spring
         *          - Quand il est référencé par un autre bean
         *          - Quand il est explicitement récupéré de la bean factory associée
         *          - Quand il référence un autre bean
         * */

        /*
         * Q16: Comment déclare-t-on un endpoint REST dans Spring ?
         *
         * ==> Rep16: @RestController
         *
         *  Choix:
         *     @RestEndpoint
         *     @RestController
         *     @Rest
         *     @REST
         * */

        /*
         * Q17: On considère une entitée User et l'interface UserRepository associée, héritée de CrudRepository,
         * qui permet son accès depuis la base.
         *
         *   public interface UserRepository extends CrudRepository<User, Long>{
         *       User XXXX(Long id);
         *   }
         *   Quelle méthode devriez-vous définir pour permettre de récupérer un objet User à partir de son id ?
         *   Écrivez le nom de la méthode.
         *
         *   ==> Rep17:
         *        findUserById
         *        getUserById
         *        readUserById
         * */

        /*
         * Q18:  Vous souhaitez que la classe suivante soit détectée par un scan Spring et enregistrée en tant que bean.
         *       Quelle annotation utiliseriez-vous ?
         *
         *  @XXXXXX
         *  public class loggingServiceImpl implements LoggingService {
         *      // implementation
         *  }
         *
         *  ==> Rep18: Component
         *
         *   Choix:
         *       Component
         *       Bean
         *       Scannable
         *       Register
         * */

        /*
         * Q19: Comment appelle-t-on les objets qui sont instanciés, managés et détruits par un containeur IoC Spring ?
         *
         * ==> Rep19: beans || Spring beans || bean || Spring bean
         * */

        /*
         * Q20: Quelle annotation peut-on utiliser pour injecter un bean Spring ?
         *
         * ==> Rep20: @Autowired
         *
         *   Choix:
         *      @Autowired
         *      @PostConstruct
         *      @Bean
         *      @Component
         *      @InjectBean
         * */

        /*
         * Q21:    On considère les deux classes suivantes.
         *         L'une qui définit une vérification de condition custom :
         *
         *    public class ModelExistsCondition implements Condition {
         *        public boolean modelVariableExists(ConditionContext context, AnnotatedTypeMetadata metadat){
         *            Environment env = context.getEnvironment();
         *            return env.containsProperty("MODEL");
         *        }
         *     }
         *
         *     et une autre qui définit un bean :
         *
         *     @Bean
         *     XXXXX
         *     public class ModelProcessor {
         *        // implementation
         *     }
         *
         *  Vous souhaitez que le bean ModelProcessor soit créé seulement si la variable d'environnement MODEL existe.
         *  En utilisant ModelExistsCondition, par quelle annotation remplacer XXX ci-dessus ?
         *  Écrivez l'annotation complète.
         *
         *  ==> Rep21:
         *         @Conditional(ModelExistsCondition.class)
         *         Conditional(ModelExistsCondition.class)
         *         @Conditional(ModelExistsCondition)
         *         Conditional(ModelExistsCondition)
         * */

        /*
         * Q22:  Quelle méthodes vont être interceptées par ce pointcut ?
         *
         *      @Pointcut("execution(public * find*(..))")
         *      private void someOperations(){};
         *
         *  ==> Rep22:
         *        public String findName() ==> OK
         *        public char[] findPassword(boolean cache) ==> OK
         *        protected String findAddress() ==> KO
         *        public void createOrFindAccount(String name, char[] pass) ==> KO
         * */

        /*
         * Q23:   @PreFilter et @PostFilter s'appliquent à ...
         *        Plusieurs réponses attendues.
         *
         *  ==> Rep23:
         *
         *       @PreFilter s'applique aux paramètres d'entrée de la méthode annotée ==> OK
         *       @PostFilter s'applique aux valeurs de retour de la méthode annotée  ==> OK
         *       @PreFilter s'applique aux requêtes de servlet  ==> KO
         *       @PostFilter s'applique aux requêtes de servlet  ==> KO
         * */

        /*
         * Q24:
         *   Vous avez un certain nombre de bean injectés (autowired) dans une List d'objets,
         *   sans que cette liste soit explicitement déclarée.
         *   Vous souhaitez définir leurs positions respectives dans cette liste, c-à-d
         *   lequel est premier, lequel est second, etc.
         *   Quelle annotation Spring peut vous aider dans cette tâche ?
         *
         *  ==> Rep24: @Order
         *
         *      Choix:
         *         @Position
         *         @Number
         *         @Sort
         *         @Order
         * */

        /*
         * Q25:
         *  Le code ci-dessous est supposé faire un appel à une méthode statique d'une classe communément
         *  utilisée de Spring Security ( XXX dans l'image) pour récupérer le nom de l'utilisateur actuellement loggué.
         *  Quelle est cette classe ?
         *
         *   String name = XXX.getContext().getAuthentication().getName();
         *
         *   Écrivez le nom de cette classe (sans le nom du package).
         *
         *  ==> Rep25:  org.springframework.security.core.context.SecurityContextHolder || SecurityContextHolder
         * */

        /*
         * Q26:
         *     Quelle est le nom de l'interface Spring implémentée ci-dessous,
         *     utilisée pour valider un business model depuis plusieurs modules Spring ?
         *
         *     public static UserValidator implements XXXXX {
         *        public boolean supports(Class clazz){
         *           return User.class.equals(clazz);
         *        }
         *
         *        public void validate(Object obj, Errors e){
         *             ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
         *             User user = (User) obj;
         *             if(user.getAge() <0 ){
         *                  e.rejectValue("age", "negative");
         *             }
         *          }
         *       }
         *
         *  ==> Rep26:  Validator  || org.springframework.validation.Validator
         * */

        /*
         * Q27:
         *   You want to have a child bean with prototype scope injected into a parent bean with
         *   singleton scope. You expect a new instance of child bean to be created whenever it is
         *   referenced by the parent.
         *   what options de you have?
         *
         *   ==> Rep27:  - Mark the prototype bean as a scoped-proxy in Spring context.
         *              - Define a look-up method in parent and define a look-up element in the
         *                context, wiring the method creating prototype bean to it.
         *
         *   Choix:
         *      - Define a look-up method in parent and define a look-up element in the
         *        context, wiring the method creating prototype bean to it.
         *      - Only annotate them as usual (singleton and prototype in context), Spring
         *        will figure scopes out
         *      - Mark the prototype bean as a scoped-proxy in Spring context.
         *      - Write a singleton decorator that will wrap single instance of prototype
         *        bean and wire this decorator into the parent.
         * */

        /*
         * Q28:
         *   <beans xmlns="..."
         *          xmlns:xsi="..."
         *          xmlns:context="..."
         *          xsi:schemaLocation="...">
         *
         *        <context:component-scan base-package="org.elo.model" />
         *        <bean id="eloService" class="org.elo.logic.EloService"/>
         *        <bean id="docService" class="org.elo.logic.DocService"/>
         *        <bean id="cacheService" class="org.elo.logic.CacheService"/>
         *    </beans>
         *
         *    The main application class using this context is
         *    public class MainApp{
         *       public static void main(String[] args){
         *         ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
         *         EloService eloService = (EloService) context.getBean("eloService");
         *         System.out.println(eloService.getDocService());
         *       }
         *    }
         *
         *    All beans classes in the context (EloLogic, DocService, CacheService) are annotated with
         *    @Component, and EloService has injected dependencies of DocService and CacheService
         *    with @Autowired. The application prints the address of the existing instance of DocService.
         *
         *    Developers notice that the component-scan line point to an unused package, so they
         *    remove it. What will happen then?
         *
         *  ==> Rep28 :  Nothing will change because base-package points to a different package
         *
         *      Choix:
         *        - Spring will throw en exception on startup,because there is no component scanning
         *        - Code will not compile
         *        - App will print null because <component-scan> implicitly includes annotation-config
         *        - Nothing will change because base-package points to a different package
         * */

    }
}
