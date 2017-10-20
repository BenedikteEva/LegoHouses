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
                Her lige en kort beskrivelse af hvad jeg har undladt at gøre i det forhåndenværende
                forsøg på at løse Legohus opgaven:<br><br>
        
            
                1. Der stod ikke noget om at have en dato på ordrerne, men som regel når man har med ordreafgivelse
                at gøre vil man have en sådan med. Har oplevet problemer med at oversætte dato fra java til mysql.<br><br>
                
                2. Forbandt typer: der er et vist antal muligheder for at lave en velkonstrueret bygning med 3 typer klodser.
                og med velkonstrueret mener jeg at de eneste steder hvor legoklodsernes sider må flugte er i enderne (og yder og indervæg). 
                Jeg har valgt ikke at lave den nødvendige matematik, da dette ville tage noget tid så jeg har bare nøjes med 
                3 typer af forbandt, som  alt efter hvordan man vælger at bygge, ville kunne sættes i forskellige mønstre.
                Jeg har ikke brugt tid på at beskrive mønstrene. <br><br>
                
                3. Det forventes i opgaven at der er en facade mellem præsentations og forretningslag og evt. mellem 
                forretningslaget og datamappers. 
                LogicFacade i mit program er såvidt jeg kan se en facade mellem forretningslag og datamappers. Jeg har ikke helt
                kunnet gennemskue hvordan man laver en facade mellem præsentionslag og forretningslag og nødvendigheden af dette 
                når man allerede benytter sig af et frontcontroller pattern. 
                Det kan dog nævnes at der er nogle enkelte steder hvor en facade kan være handy. f.eks. har jeg en udfør knap 
                og en se stykliste knap, de kunne med users fordel slås sammen til en og man kunne måske bruge en ekstra extension klasse her. 
                Class Noget extends Command - Class stykListe extends Noget og Class Odetails extends Noget. Jeg håber jeg når at implementere dette.
                
                
                4. Jeg kunne godt tænke mig at nå at smide alle jsp siderne tilbage i webinfo undtaget index.jsp. 
              
                
                her er der to links som jeg muligvis kan bruge til at skabe en facade i hvertfald hos den almindelige kunde
                http://javapapers.com/design-patterns/facade-design-pattern/
               https://dzone.com/articles/design-patterns-uncovered-1
              
        
        
        
      </div>
         <p>Made by BenedikteEva 2017</p>
    </body>
</html>
