/**
 * @author ALLOUM on 21/04/2020
 */
public class SolutionAngularTest {

    /**************************** ANGULAR ******************************************/
    /*
     * Q1:
     *    import { Component } from '@angular/core';
     *    @Component({
     *       selector: 'my-app',
     *       template:
     *         `<button type="button" (click)="onClick()">Click Me</button>
     *          <h1 *ngIf="show">
     *            {{name}}
     *          </h1>
     *         `
     *     })
     *    export class AppComponent {
     *      name= 'Abderrahim';
     *      show= true;
     *      onClick(){
     *         this.show = !this.show
     *       }
     *     }
     *
     *  ==> Rep1: La propriété name est affichée une fois sur deux
     * */

    /*
     * Q2:
     *  Quelle ligne de commande permet de créer une nouvelle application Angular ?
     *
     *  ==> Rep2: ng new appName
     * */

    /*
     *  Q3:
     *  Quelle concept Angular est mis en oeuvre dans le template ci-dessous à la ligne 6 pour afficher la propriété name ?
     *    import { Component } from '@angular/core';
     *    @Component({
     *       selector: 'my-app',
     *       template:
     *         `<h1> HELLO {{name}} </h1>
     *         `
     *     })
     *    export class AppComponent {
     *      name= 'Abderrahim';
     *     }
     *
     *  ==> Rep3:  string interpolation
     * */

    /*
     *  Q4: Quel module doit-on importer pour utiliser le service HttpClient ?
     *
     *  ==> Rep4:  HttpClientModule
     *
     *  choix:
     *    HttpClientModule
     *    HttpModule
     *    RequestModule
     *    TransportModule
     *    ClientModule
     * */

    /*
     *  Q5: Quel(s) nom(s) seront affichés par ce code ?
     *    import { Component } from '@angular/core';
     *    @Component({
     *       selector: 'my-app',
     *       template:
     *         `
     *         <div *ngFor="let name of names ">
     *            <div *ngIf = "name.length > 6">
     *                {{name}}
     *            </div>
     *         </div>
     *         `
     *     })
     *    export class AppComponent {
     *      name= ["Theresa", "Morris", "Duane" , "Taz"];
     *    }
     *
     *    ==> Rep5: Theresa
     * */

    /*
     * Q6:  Parmi les propositions suivantes, laquelle n'est pas un directive structurelle d'Angular ?
     *
     * ==> Rep6: ngUnless
     *
     *  choix:
     *      ngIf
     *      ngFor
     *      ngSwitch
     *      ngUnless
     * */

    /*
     * Q7: Ligne 7, par quoi doit-on remplacer ?? pour que la directive ngFor puisse fonctionner ?
     *    import { Component } from '@angular/core';
     *    @Component({
     *       selector: 'my-app',
     *       template:
     *         `
     *         <ul>
     *          <li *ngFor="let user ?? users ">  ==>Ligne7
     *             {{user.name}}/{{user.email}}
     *          </li>
     *         </ul>
     *         `
     *     })
     *    export class AppComponent {
     *      users= [
     *       {name: 'Theresa George', email:'theresa.george@example.com'},
     *       {name: 'Morris Murray', email:'morris.murray@example.com'}
     *      ];
     *    }
     *
     * ==> Rep7: of
     * */

    /*
     *  Q8: Qu'utiliseriez-vous pour ajouter le même entête HTTP à tous vos appels HTTP ?
     *
     *  ==> Rep8: Un Interceptor
     *
     *  choix:
     *    Un Injector
     *    Un Interceptor
     *    Par injection de dépendances
     *    L'entête doit être ajouté à chaque appel manuellement
     * */

    /*
     *  Q9: Quel tag est utilisé pour afficher du contenu différent en fonction de la route ?
     *
     *  ==> Rep9: <router-outlet></router-outlet>
     *
     *  Choix:
     *      <router></router>
     *      <router-output></router-output>
     *      <route></route>
     *      <router-outlet></router-outlet>
     * */

    /*
     *  Q10: Au sein de l'objet de type Routes, quelle propriété permet de définir des routes filles ?
     *
     *  ==> Rep10: children
     *
     *  Choix:
     *      loadChildren
     *      route
     *      children
     *      childRoutes
     * */

    /*
     *  Q11: Quelle commande ne fait pas partie de la CLI Angular ?
     *
     *  ==> Rep11: ng exit
     *
     *   choix:
     *       ng test
     *       ng lint
     *       ng exit
     *       ng deploy
     * */

    /*
     *  Q12: On suppose que la locale par défaut est en-US. Qu'affichera l'expression de la ligne n°6 ?
     *    import { Component } from '@angular/core';
     *    @Component({
     *       selector: 'my-app',
     *       template:
     *         `
     *         {{ cost | currency }}
     *         `
     *     })
     *    export class AppComponent {
     *       cost = '200.13';
     *    }
     *
     * ==> Rep12: $200.13
     * */

    /*
     *  Q13: Quel module doit-on importer pour pouvoir utiliser [(ngModel)] ?
     *
     *  ==> Rep13: FormsModule
     *
     *   Choix:
     *        NgModule
     *        BrowserModule
     *        FormsModule
     *        InputModule
     * */

    /*
     *  Q14: Quel service peut-on utiliser pour récupérer les paramètres de route depuis un composant ?
     *
     *  ==> Rep14 : ActivatedRoute
     *
     *  Choix:
     *      Route
     *      Router
     *      ActivatedRoute
     *      CurrentRoute
     * */

    /*
     * Q15:  Parmi les propositions ci-contre, quelle est celle qui désigne une extension chrome pour debugguer
     *       les apps Angular?
     *
     *  ==> Rep15: augury
     *
     *       Choix:
     *          -> augury
     *          -> ngrx
     *          -> npx
     *          -> npm
     * */


    /*
     * Q16:  Quel décorateur peut-on utiliser pour écouter les événements de l'élément hote
     *      depuis une directive fille?
     *
     * ==> Rep16: @HostListener
     *
     *      Choix:
     *        -> @Target
     *        -> @HostListener
     *        -> @Listener
     *        -> @Event
     * */

    /*
     * Q17:  Parmi les propositions suivantes,laquelle n'est pas une méthode du cycle de vie Angular?
     *
     * ==> Rep17: ngContentChange
     *
     *      Choix:
     *        -> ngContentChange
     *        -> ngAfterViewInit
     *        -> ngOnChanges
     *        -> ngOnDestroy
     * */

}



