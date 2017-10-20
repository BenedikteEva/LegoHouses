<%-- 
    Document   : AboutAssignment
    Created on : 17-10-2017, 16:47:28
    Author     : Ejer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <<head>
        <title>AboutAssignment</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/miniCss.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div class="container">
           <nav> 
                <ul>
                    <form name="logout" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="logout">
                        <li><input type="submit" value="Log ud" name="logout">Log ud</a></li>
                    </form>

                    <form name="backcustomer" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="backcustomer">
                        <li><input type="submit" value="Bestil huse" name="backcustomer">Bestil flere huse</a></li>
                    </form>
                </ul> 
            </nav>
           
            
            <br>
           
            <br>
            
            <p>  Her lige en kort beskrivelse af hvad jeg har undladt at gøre i det forhåndenværende
                forsøg på at løse Legohus opgaven:<br><br>
       
                1. Der stod ikke noget om at have en dato på ordrerne, men som regel når man har med ordreafgivelse
                at gøre vil man have en sådan med. Har oplevet problemer med at oversætte dato fra java til mysql.<br><br>
                
                2. Forbandt typer: der er et vist antal muligheder for at lave en velkonstrueret bygning med 3 typer klodser.
                og med velkonstrueret mener jeg at de eneste steder hvor legoklodsernes sider må flugte er i enderne (og yder og indervæg). 
                <br><br>
                Jeg har valgt at lave en simplpificeret matematik, da dette ellers ville tage noget tid fra programmeringen 
                så jeg har bare nøjes med 3 typer af forbandt, som  alt efter hvordan man vælger at bygge, ville kunne sættes i forskellige mønstre.
                <br><br>
                I det øjeblik man i det ene lag bygger med uret og i det efterfølgende mod uret vil lagene blive forskudt i 
                hvis de klodstyper man starter med er forskellige i hvert lag. <br>
                Ellers hvis det er en simpel forbandttype med kun 2x4 klodser skiftes mellem siderne når man starter med at lægge den første klods i et lag.
                Jeg har ikke brugt tid på at beskrive mønstrene. <br><br>
                
                3. Det forventes i opgaven at der er en facade mellem præsentations og forretningslag og evt. mellem 
                forretningslaget og datamappers. <br><br>
                LogicFacade i mit program er såvidt jeg kan se en facade mellem forretningslag og datamappers. Jeg har ikke helt
                kunnet gennemskue hvordan man laver en facade mellem præsentionslag og forretningslag og nødvendigheden af dette 
                når man allerede benytter sig af et frontcontroller pattern. <br><br>
                Det kan dog nævnes at der er nogle enkelte steder hvor en facade kan være handy. f.eks. har jeg en udfør knap 
                og en se stykliste knap, de kunne til kundens fordel slås sammen til en og man kunne måske bruge en ekstra extension klasse her. 
                Class Noget extends Command - Class stykListe extends Noget og Class Odetails extends Noget. Jeg håber jeg når at implementere dette.
                <br>
                <br>
                4. Jeg kunne godt tænke mig at nå at smide alle jsp siderne tilbage i webinfo undtaget index.jsp. 
                <br>
             
               <br><br>
               
               Her er hvad jeg har fået gjort:
               <br><br>
               Kundekrav 1-4 er opfyldt:<br>
               1. En kunde kan oprette en ordre og se stykliste for denne.<br>
               2. Kunden kan se sine tidligere ordrer og styklister for dem. <br>
               3. Kunden kan se om ordren er afsendt eller ikke.<br>
               4. Styklisterne er næsten lige så pæne som i opgavebeskrivelsen
               <br><br>
               Firmakrav 1-2 er opfyldt:<br><br>
               1. En ansat kan se hvilke ordrer der er i systemet. (dog kun ved at vælge en kunde);<br>
               2. Kan markere en ordre som afsendt. <br>
               <br>
              <br>
               Kvalitetskrav:<br><br>
               GitHub:      yep<br>
               3-lagsmodel: yep<br>
               Facade mellem præsentations og forretningslag:   nope<br>
               Forretningslag og datamappers LogicFacade: yep<br>
               Ingen forretningslogik på jsp sider: yep<br>
               Ingen datamappers på jsp sider:  yep<br>
               Korrekt brug af sessions- og requestattributter: yep (måske en smutter et sted).<br>
               Ingen redirect: yep (da jeg har brugt frontcontrolleren konsekvent er det kun i den det har været nødvendigt med requestdispatcher.)<br>
               Styklister beregnes i forretningslaget: yep<br>
               Exception håndtering: yep har en exception som bliver kastet fra mapperne. <br>
               Specialiseret exception: nope.<br>
               Frontcontroller: yep<br>
               Døre og vinduer: nope<br>
         
               
               <br>
               Min oplevelse som elev:
               <br>
               Det har helt klart hjulpet at få nogle best practices på i form af designpatterns og arkitektur
               så man ikke hele tiden skal gætte sig til hvordan man strukturerer sin kode.
               <br>
               Det var en vældig hyggelig opgave, med en god sværhedsgrad ud fra mit nuværende niveau. 
               <br>
            </p>
              
        
      </div>
         <p>Made by BenedikteEva 2017</p>
    </body>
</html>
