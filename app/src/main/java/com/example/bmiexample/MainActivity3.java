package com.example.bmiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private TextView Text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Text=findViewById(R.id.textView);
    }
    Intent intent= getIntent();
    String  type =intent.getStringExtra("data");
    public void show(String type){
        if (type=="baseball"){
            Text.setText("Innings & outs\n" +
                    "An “out” is when an offensive player must leave the field after:\n" +
                    "\n" +
                    "Being tagged by a ball in play\n" +
                    "Not making it to the base or home plate before a member of the opposing team with the ball in their glove does\n" +
                    "Swinging three times at a pitch and missing all three times\n" +
                    "Once the offensive team gets three outs, it’s their turn to play defense. An inning ends after both teams have played both offense and defense, and each team gets three outs.\n" +
                    "\n" +
                    "Strikes\n" +
                    "Each batter has three chances to hit a ball that’s pitched to them. If they swing and miss, or they don’t swing on a pitch that’s ruled fair by the umpire, it’s called a strike. After three strikes, the team receives an “out.”\n" +
                    "\n" +
                    "Foul balls\n" +
                    "There are lines drawn on the field that connect the bases. The lines leading from home plate to first base, and from home plate to third base are used to determine whether a ball is in play. If the ball is hit between the base lines, it’s in play. If a ball is hit outside of the base lines, it’s called a foul.\n" +
                    "\n" +
                    "If a batter hits a foul on the first or second pitch, it counts as a strike. If a batter hits a foul on the third pitch, it counts as a foul, and the batter is allowed another pitch.\n" +
                    "\n" +
                    "Balls\n" +
                    "If a pitcher throws an unfair pitch, it’s called a ball. If the pitcher throws four balls, then the batter is allowed to walk to first base.");
        }
        else if (type=="basketball"){
            Text.setText("What Are the Rules of Basketball?\n" +
                    "Dr. James Naismith invented the game of basketball in Springfield, Massachusetts, in 1891. The objective of today's game stems directly from Naismith's original rules that are based around shooting a ball through a metal hoop suspended above the ground, which is called a basket. These rules include;\n" +
                    "\n" +
                    "Only five players per team on the court. In the NBA, WNBA, and NCAA basketball, each team can play a maximum number of five players on the court. If a team breaks this main rule, they will lose possession of the ball. Sometimes this inadvertently happens, particularly at low levels of the game, when substitute players check into the game and others don't leave the court in time.\n" +
                    "Score more than your opponent to win. To win the game, a team must score more field goals than the other team. A field goal refers to any basket a player scores during gameplay. Field goals can be worth two or three points. Field goals shot from inside the arc that designates the three-point line on the court are worth two points. Field goals shot from outside the arc are worth three points. Field goals can take the form of jump shots, layups, slam dunks, and tip-ins.\n" +
                    "Score within the shot clock. Teams have a limited amount of time to shoot the ball during a given possession. In the NBA and WNBA, teams are allowed 24 seconds of possession before they must shoot, while NCAA teams are allowed 30 seconds. A shot clock mounted above the hoop on each side of the court displays and counts down the time allotted. If the shot clock elapses, the opposing team forfeits the ball and becomes the defensive team.\n" +
                    "Dribbling advances the ball. Basketball players may only advance the ball by passing or dribbling (bouncing the ball on the floor) as they move up and down the court. If a player stops dribbling, they may not resume; instead, they must pass the ball or shoot it. If an offensive player with possession of the ball stops then continues dribbling before passing or shooting, the referee will call a “double dribble,” and the opposing team gets the ball. Additionally, players may only advance the ball by dribbling it. If they run while holding the ball, they are traveling. Referees will issue a traveling call, and possession of the ball will go to the opposing team.\n" +
                    "The offense has five seconds to inbound the ball. After the offense scores a basket, the opposing team receives possession of the ball. One of their players has to inbound the ball from a designated spot on the sidelines of the court to resume gameplay. The player has five seconds to pass the ball to another player on his team, or else the team loses possession. The defender cannot contact the ball when the offensive player is trying to inbound it, or the referee can issue a technical foul.\n" +
                    "The offense must advance the ball. Once an offensive team advances the ball past the half-court line, the ballhandler may not cross that line again, or a referee will award possession of the ball to the opposing team.\n" +
                    "Ball and ballhandler must remain inbounds. During gameplay, the player with possession of the ball must stay within the designated inbounds lines marked on the court. If a player steps out of bounds or touches this line with their foot while holding the ball, the referee will award possession to the opposing team. Additionally, if a player shoots the ball while their foot is touching the line and the shot is successful, it will not count.\n" +
                    "Defenders can’t interfere with a shot on a downward trajectory. After the offensive player shoots the ball, it is illegal for a defensive player to interfere with it once it begins its descent toward the rim. This interference is called a goaltend and will result in an automatic field goal for the offense.\n" +
                    "Defenders can legally block or steal the ball. The defending team’s goal is to prevent the offensive team from scoring by either stealing the ball, blocking the ball from entering the basket, or using defensive tactics to prevent an offensive player from shooting and scoring.\n" +
                    "Defenders must leave the paint after three seconds. The area directly in front of the basket is sometimes referred to as \"the paint\" or \"inside the key.\" Offensive players may not camp out in this area waiting for the ball or an offensive rebound. Any individual player can spend a maximum of three seconds at a time in the space before they have to move. Once they step out of the paint, they can return. If the referee notices a player hovering in the paint for over three seconds, the team will receive a three-second violation.\n" +
                    "Each team is allotted a certain number of fouls. The NBA allows each team a total of five fouls per quarter. Once a team surpasses this allotment, they go “into the bonus,” which means the officials will award the opposing team with free throws for every additional foul that a player commits in that quarter of play. In the NCAA, these foul shots are known as \"one and one\" shots, which means that if a player makes the first free throw, they receive a second free throw. If they miss the first free throw, either team can rebound the errant shot and claim possession. After 10 team fouls, the opposing team gets a \"double bonus,\" which means they get to take two foul shots.\n" +
                    "Illegal contact results in a foul. When a basketball player commits illegal physical contact against an opposing player, the referees will call a personal foul. Most player fouls involve contact that impedes an opposing player's gameplay. When a player fouls another player on an opposing team in the act of shooting, the referee rewards the fouled player with unguarded free throws from the foul line. Each successfully made free throw counts for one point. Referees can assess coaches with fouls for unsportsmanlike acts, such as using profanity to dispute a missed call.\n" +
                    "Illegal contact results in a personal foul. A personal foul is an infraction that violates the rules of the game. Players can incur personal fouls by pushing, blocking, or striking another player in the act of shooting. Shooting fouls result in free throw attempts for the fouled player. If a defender fouls a shooter attempting a two-point shot, the shooter will receive two free throws. If a shooter is fouled during a three-point shot attempt, they will receive three free throws. If the player makes the shot they were attempting at the time of illegal contact, the basket counts, and the shooter will receive one free throw.\n" +
                    "Excessive contact results in a flagrant foul. Flagrant fouls refer to a personal foul that can potentially injure the opponent. These fouls carry heavier penalties, such as fines, immediate ejection, and even suspension. There are two types of flagrant fouls: flagrant foul—penalty (1) and flagrant foul—penalty (2). Flagrant 1 refers to fouls involving unnecessary contact. The penalty for this foul type is a free throw for the opponent and possession of the ball. Flagrant 2 refers to any foul involving unnecessary and excessive contact. Officials perform an instant-play review to determine if an act qualifies for the flagrant 2 penalty. If it does, the player at fault is assessed a fine and an automatic ejection from the game, and the opposing team receives free throws and possession of the ball.\n" +
                    "Charges and illegal screens result in an offensive foul. An offensive foul is a personal foul that offensive players commit when their team possesses the ball. The two most common offensive fouls are charging and illegal ball screens. Charging is when an offensive player makes contact with a defensive player who has planted their feet in a locked position. An illegal screen is when a non-ball-handling offensive player moves while setting a screen for their teammate to prevent the defender from moving about the court.\n" +
                    "Certain rule violations result in technical fouls. A technical foul is a penalty for violating the game’s administrative rules. Officials commonly assess technical fouls for fighting and verbal abuse, often assessing coaches with this penalty if they are too abrasive when disputing a call. Technical fouls result in a free throw and a change of possession. If a player or coach receives two technical fouls in the same game, the referee will eject them. Players with a long history of technical fouls risk suspension from the regular season and even playoff games.");
        }
        else if (type=="soccer"){
            Text.setText("A match consists of two 45 minutes halves with a 15 minute rest period in between.\n" +
                    "Each team can have a minimum off 11 players (including 1 goalkeeper who is the only player allowed to handle the ball within the 18 yard box) and a minimum of 7 players are needed to constitute a match.\n" +
                    "The field must be made of either artificial or natural grass. The size of pitches is allowed to vary but must be within 100-130 yards long and 50-100 yards wide. The pitch must also be marked with a rectangular shape around the outside showing out of bounds, two six yard boxes, two 18 yard boxes and a centre circle. A spot for a penalty placed 12 yards out of both goals and centre circle must also be visible.\n" +
                    "The ball must have a circumference of 58-61cm and be of a circular shape.\n" +
                    "Each team can name up to 7 substitute players. Substitutions can be made at any time of the match with each team being able to make a maximum of 3 substitutions per side. In the event of all three substitutes being made and a player having to leave the field for injury the team will be forced to play without a replacement for that player.\n" +
                    "Each game must include one referee and two assistant referee’s (linesmen). It’s the job of the referee to act as time keeper and make any decisions which may need to be made such as fouls, free kicks, throw ins, penalties and added on time at the end of each half. The referee may consult the assistant referees at any time in the match regarding a decision. It’s the assistant referee’s job to spot offside’s in the match (see below), throw ins for either team and also assist the referee in all decision making processes where appropriate.\n" +
                    "If the game needs to head to extra time as a result of both teams being level in a match then 30 minutes will be added in the form of two 15 minute halves after the allotted 90 minutes.\n" +
                    "If teams are still level after extra time then a penalty shootout must take place.\n" +
                    "The whole ball must cross the goal line for it to constitute as a goal.\n" +
                    "For fouls committed a player could receive either a yellow or red card depending on the severity of the foul; this comes down to the referee’s discretion. The yellow is a warning and a red card is a dismissal of that player. Two yellow cards will equal one red. Once a player is sent off then they cannot be replaced.\n" +
                    "If a ball goes out of play off an opponent in either of the side lines then it is given as a throw in. If it goes out of play off an attacking player on the base line then it is a goal kick. If it comes off a defending player it is a corner kick.\n" +
                    "The Offside Rule in Football\n" +
                    "Offside can be called when an attacking player is in front of the last defender when the pass is played through to them. The offside area is designed to discourage players from simply hanging around the opponent’s goal waiting for a pass. To be onside they must be placed behind the last defender when the ball is played to them. If the player is in front of that last defender then he is deemed to be offside and free kick to the defending team will be called.\n" +
                    "\n" +
                    "A player cannot be caught offside in their own half. The goalkeeper does not count as a defender. If the ball is played backwards and the player is in front of the last defender then he is deemed to be not offside.");
        }
        else if (type=="football"){
            Text.setText("All teams must take the field with five players\n" +
                    "Mixed teams must take the field with a minimum of two female outfield players. Either gender is allowed in goals\n" +
                    "Unlimited interchange will be allowed for all matches\n" +
                    "Kick offs will be taken from half way\n" +
                    "No slide tackles\n" +
                    "No offside\n" +
                    "No throw ins\n" +
                    "No corners\n" +
                    "If the ball hits any part of the net behind the goalkeeper off a shot, keeper save or deflection, the ball automatically goes to the goalkeeper for a restart. An indirect free kick shall be awarded at the referees discretion should a player kick the ball into their own back net.\n" +
                    "Goalkeepers can pass the ball out with their feet or throw it out with their hands\n" +
                    "Goalkeepers cannot come outside of their goal circle at anytime\n" +
                    "Goalkeepers may not pick the ball up if it has been passed to them from a team mate\n" +
                    "Goalkeepers cannot kick the ball out of their hands\n" +
                    "Goalkeepers must release the ball within 6 seconds\n" +
                    "If a team kicks the ball out of the pitch, the match will be a restart with the goalkeeper of the opposing team\n" +
                    "All free kicks are indirect\n" +
                    "No pushing or grinding into the rebound boards\n" +
                    "Serious foul play will be punishable by yellow and red cards\n" +
                    "In the event of a penalty being awarded all penalty takers can only take one step before striking the ball");
        }
        else if (type=="tennis"){
            Text.setText("General Rules of Tennis\n" +
                    "\n" +
                    "A ball must land within bounds for play to continue; if a player hits the ball outside of bounds, this results in the loss of the point for them.\n" +
                    "Players/teams cannot touch the net or posts or cross onto the opponent’s side.\n" +
                    "Players/teams cannot carry the ball or catch it with the racquet.\n" +
                    "Players cannot hit the ball twice.\n" +
                    "Players must wait until the ball passes the net before they can return it.\n" +
                    "A player that does not return a live ball before it bounces twice loses the point.\n" +
                    "If the ball hits or touches the players, that counts as a penalty.\n" +
                    "If the racquet leaves the hand or verbal abuse occurs, a penalty is given.\n" +
                    "Any ball that bounces on the lines of boundary are considered good.\n" +
                    "A serve must bounce first before the receiving player can return it.\n" +
                    "Equipment\n" +
                    "\n" +
                    "Racquet – A racquet is comprised of a handle, a frame, and strings that are bound in a crisscross weaving pattern. A racquet’s frame should not exceed 32 inches in length, with a handle no longer than 12.5 inches in width, and a surface no more than 15.5 inches in overall length or 11.5 inches in width. There can also be no objects or devices on the racquet except for ones that prevent vibration and wear and tear.\n" +
                    "Ball – A tennis ball is white or yellow in color for tournaments, with measurements of 2-1/2 to 2-5/8 inches in diameter and weighing anywhere from 2 to 2-1/16 ounces. The elasticity of the ball and the uniform outer surface are also determined by approved specifications.\n" +
                    "Scoring\n" +
                    "\n" +
                    "Points – Smallest unit of measurement. Points increment from Love(0)-15-30-40-game.\n" +
                    "Games – Games consist of 4 points each, and is won when a player reaches 4 points with at least a 2 point advantage.\n" +
                    "Sets – A set consists of 6 games and is won by the player/team who reaches 6 games first with least a 2 point lead.\n" +
                    "Advantage Set – If a game score of 6-6 is reached and advantage set rules are used, a player/team can only win a set with a 2 game lead.\n" +
                    "Matches – A match is usually played as best of 3 or best of 5 sets.\n" +
                    "Deuce – Occurs if a score of 40-40 is reached. In order to win the game, a player/team must win 2 consecutive points in order to take the game. If a player wins one point, they have advantage, but if they lose the next point, the score returns to deuce.\n" +
                    "Tie-break game – If a game score of 6-6 is reached and tie-break set rules are used, players must play a tie-break game in order to decide who wins the set. In a tie-break game, a player/team must reach 7 points with a two point advantage to win. For the serving format of a tie-break game, player 1 serves for the first point, player 2 serves for the next two points, player 1 serves for the next two points after that, etc.");
        }
        else if (type=="voleyball"){
            Text.setText("Basic Volleyball Rules for Playing the Game\n" +
                    "6 players on a team, 3 on the front row and 3 on the back row\n" +
                    "Maximum of three hits per side\n" +
                    "Player may not hit the ball twice in succession (A block is not considered a hit)\n" +
                    "Ball may be played off the net during a volley and on a serve\n" +
                    "A ball hitting a boundary line is \"in\"\n" +
                    "A ball is \"out\" if it hits... \n" +
                    "\n" +
                    "an antennae,\n" +
                    "\n" +
                    "the floor completely outside the court,\n" +
                    "\n" +
                    "any of the net or cables outside the antennae,\n" +
                    "\n" +
                    "the referee stand or pole,\n" +
                    "\n" +
                    "the ceiling above a non-playable area\n" +
                    "It is legal to contact the ball with any part of a players body\n" +
                    "It is illegal to catch, hold, or throw the ball\n" +
                    "If two or more players contact the ball at the same time, it is considered one play and either player involved may make the next contact (provided the next contact isn't the teams 4th hit)\n" +
                    "A player can not block or attack a serve from on or inside the 10 foot line\n" +
                    "After the serve, front line players may switch positions at the net\n" +
                    "At higher competition, the officiating crew may be made up of two refs, line judges, scorer, and an assistant scorer");
        }


    }

}