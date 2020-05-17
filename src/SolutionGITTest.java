/**
 * @author ALLOUM Abderrahim on 17/05/2020
 * @project aa-test-codingame
 */
public class SolutionGITTest {

    /*********************** GIT ***********************************/
    /*
     *  Q1:
     *  Votre projet génère des logs qui sont écrits dans de multiples fichiers tels que
     *  error.log, warning.log et debug.log
     *  Vous ne voulez pas commiter ces fichiers dans le depot. Mais comme ils sont générés
     *  dans votre espace de travail, il apparaissent en tant que fichiers non versionnés à
     *  l'execution de la commande "git status"
     *
     *  Quel fichier devriez-vous ajouter et modifier à la racine de votre espace de travail pour
     *  que les fichiers .log ne soient pas pris en compte par Git?
     *
     * ==> Rep1: .gitignore
     * */

    /*
     *  Q2:
     *  Que fait la commande "git commit"?
     *
     *  ==> Rep2 :  Elle commit les changements de la "staging area" vers le depot distant.
     *
     *       Choix:
     *         -> Elle commit les changements de la "staging area" vers le depot local.
     *         -> Elle commit les changements locaux vers le depot distant en omettant la "staging area".
     *         -> Elle commit les changements de la "staging area" vers le depot distant.
     *         -> Elle commit les changements locaux vers la "staging area"
     * */

    /*
     *  Q3:
     *  Quelle option de la ligne de commande permet de spécifier un commentaire de commit à l'execution de "git commit"
     *
     *  ==> Rep3 : -m
     *
     *       Choix:
     *         -> -i
     *         -> -m
     *         -> -l
     *         -> -a
     * */

    /*
     *  Q4:
     *  Qu'est ce qui est vrai à propos de l'option "--amend" de la commande "git commit"?
     *
     *  ==> Rep4 : -> Elle ne peut modifier que le dernier commit.
     *             -> Elle peut à la fois modifier le message de commit et ajouter des
     *                nouveaux fichiers au meme commit.
     *
     *       Choix:
     *         -> Elle ne peut modifier que le dernier commit.
     *         -> Elle ne peut modifier que le message de commit.
     *         -> Elle peut modifier plusieurs commits précédents.
     *         -> Elle peut à la fois modifier le message de commit et ajouter des
     *            nouveaux fichiers au meme commit.
     * */

    /*
     *  Q5:
     *  Quelle fonctionnalité de Github met à disposition une interface Web conviviale pour
     *  notifier les membres d'une équipe projet de la fin d'un développement et permet ensuite
     *  que les changements proposés soient revus puis intégré dans la branche master?
     *
     *  ==> Rep5 : Pull request
     *
     *       Choix:
     *         -> Notify
     *         -> Pull request
     *         -> Fork
     *         -> Clone
     * */

    /*
     *  Q6:
     *  Qu'est ce qui est vrai à propos des branches Git?
     *
     *  ==> Rep6:  -> Les branches permettent de travailler indépendamment sur différents
     *                bugs ou fonctionnalités en parallèle.
     *             -> Vous pouvez créer de multiples branches locales et ne pousser que
     *                certaines d'entre elles vers le depot distant.
     *
     *
     *       Choix:
     *         -> Les branches permettent de travailler indépendamment sur différents
     *             bugs ou fonctionnalités en parallèle.
     *        -> Vous pouvez créer de multiples branches mais vous devez merger sur
     *             master avant de basculer d'une branche à l'autre.
     *        -> Vous pouvez créer de multiples branches locales et ne pousser que
     *            certaines d'entre elles vers le depot distant.
     * */

    /*
     *  Q7:
     *   On vous demande de corriger le bug n°33. Vous créez donc une nouvelle branche "bugfix33"
     *   et commitez les changements requis sur cette branche.
     *
     *   Soit l'enchainement de commande suivante
     *        git branch bugfix33
     *        git checkout bugfix33
     *        git add index.html
     *        git commit -m "fixed footer issue"
     *        git checkout master
     *
     *  Ecrivez la prochaine commande git qui merge ces changements sur la branche master
     *  (on suppose que la branche master est à jour).
     *
     *  ==> Rep7: git merge bugfix33
     * */
}
