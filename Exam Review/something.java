

import java.util.Scanner;


public class something {
    public static final Scanner myscanner=new Scanner(System.in);

    
    public static void main(String[] args) {
        
        int[] score= new int[movies.length];
        for (int i=0; i<score.length; i++) {
            score[i]=150;
        }
        
        String SeeScore="";
        int counter1=0;
        do {
            
            do {
                int numb=0;
                int numb2=0;
                
                do {
                    numb=(int)(Math.random()*(movies.length));
                    numb2=(int)(Math.random()*(movies.length));
                    
                    
                    
                } while(numb==numb2);
                
                System.out.println("Which do you prefer? (1 or 2)");
                String choice="";
                System.out.println("1. "+movies[numb]+"    OR   2. "+movies[numb2]);
                choice=myscanner.next();
                
                
                
                double est1=0;
                double est2=0;
                if (choice.equals("1")) {
                    est1=estimate(score[numb], score[numb2]);
                    est2=estimate(score[numb2], score[numb]);
                    
                    score[numb]+=(10*(1-est1));
                    score[numb2]+=(10*(0-est2));
                }
                else if (choice.equals("2")) {
                    est1=estimate(score[numb], score[numb2]);
                    est2=estimate(score[numb2], score[numb]);
                    
                    score[numb]+=(10*(0-est1));
                    score[numb2]+=(10*(1-est2));
                }
                else {
                    System.out.println("You didn't enter 1 or 2.");
                }
                counter1++;
            } while(counter1<30);
            counter1=20;
            System.out.println("Press (y) to see score.");
            System.out.println("Press anything else to continue.");
            SeeScore=myscanner.next();
        }while (!SeeScore.equals("y"));
        SeeScore="";
        for (int y=0; y<25; y++)  {  
            int max=0;
            int maxindex=0;
            int counter=0;
            do {
                
                for (int q=0; q<movies.length; q++) {
                    if(maxindex!=counter) {
                        if (score[max]<score[q]) {
                            score[q]=max;
                            q=maxindex;
                            
                        }
                    }
                }
                counter++;
                
            }while(y==counter);
            System.out.println((y+1)+".) "+movies[max]);
        }
        System.out.println("Keep playing? (y/n)");
    }
    
    public static double estimate(int own, int other) {
        double est=1/(1 + Math.pow(10,((other-own)/40)));
        return est;
    }
    
    public static final String[] movies={"Ben-Hur",
            "Gone with the Wind",
            "Time of Violence",
            "The English Patient",
            "Schindler's List",
            "Saving Private Ryan",
            "The Deer Hunter",
            "The Elephant Man",
            "Midnight Express",
            "Titanic",
            "The Aviator",
            "Terms of Endearment",
            "American Beauty",
            "Forrest Gump",
            "Amadeus",
            "One Flew Over the Cuckoo's Nest",
            "Braveheart",
            "Gladiator",
            "Scarface",
            "There Will Be Blood",
            "The Godfather",
            "The Godfather: Part II",
            "The Pianist",
            "Das Boot",
            "Troy",
            "The Lives of Others",
            "Bicycle Thieves",
            "The Best Years of Our Lives",
            "To Kill a Mockingbird",
            "It's a Wonderful Life",
            "All About Eve",
            "On the Waterfront",
            "A Streetcar Named Desire",
            "The Sting",
            "Kramer vs. Kramer",
            "Ordinary People",
            "As Good as It Gets",
            "Groundhog Day",
            "Fight Club",
            "Gattaca",
            "The Matrix",
            "The Lord of the Rings: The Fellowship of the Ring",
            "The Lord of the Rings: The Two Towers"	,
            "The Lord of the Rings: The Return of the King",
            "Avatar",
            "Pan's Labyrinth",
            "Syriana",
            "The Talented Mr. Ripley",
            "Heat",
            "The Town",
            "Goodfellas",
            "Casino",
            "The Departed",
            "Gangs of New York",
            "Raging Bull",
            "Taxi Driver",
            "Falling Down",
            "The Good Son",
            "Devil's Advocate",
            "Philadelphia",
            "The Shawshank Redemption",
            "Eyes Wide Shut",	
            "Full Metal Jacket",
            "Barry Lyndon",
            "Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb",
            "Paths of Glory",
            "Spartacus",
            "The Shining",
            "A Clockwork Orange",
            "2001: A Space Odyssey",
            "Lolita",
            "The Killing",
            "The Cranes are Flying",
            "Z",
            "The Day of the Jackal",	
            "Chinatown",
            "The Bridge on the River Kwai",
            "Doctor Zhivago",
            "Lawrence of Arabia",
            "A Passage to India",
            "Gandhi",
            "The Last Emperor",
            "Reds",
            "Departures",
            "A Man for All Seasons",
            "High Noon",
            "Apocalypse Now",
            "Dracula",
            "The Silence of the Lambs",
            "The Social Network",
            "A Beautiful Mind",
            "12 Angry Men",
            "The Grapes of Wrath",
            "Miracle",
            "Once Upon a Time in America",
            "Once Upon a Time in the West",
            "The Good, the Bad and the Ugly",
            "Butch Cassidy and the Sundance Kid",
            "Independence Day",
            "Mystic River",
            "Django Unchained",
            "Reservoir Dogs",
            "Pulp Fiction",
            "Inglourious Basterds",
            "Platoon",
            "Born on the Fourth of July",
            "Rain Man",
            "Dead Poets Society",
            "The Graduate",
            "Breakfast at Tiffany's",
            "Fargo",
            "No Country for Old Men",
            "The Big Lebowski",
            "Rear Window",
            "Donnie Darko",
            "Psycho",
            "The Sixth Sense",
            "Mulholland Dr",
            "Warriors",
            "The Game",
            "American Psycho",
            "Snatch",
            "City of God",
            "Slumdog Millionaire",
            "Her",
            "Good Will Hunting",
            "What's Eating Gilbert Grape",
            "Moneyball",
            "Eternal Sunshine of the Spotless Mind",
            "The Usual Suspects",
            "The Untouchables",
            "Into the Wild",
            "Babel",
            "The Fighter",
            "Crash",
            "The Prestige",
            "Memento",
            "Black Swan",
            "The Wrestler",
            "The Green Mile",
            "Catch Me If You Can",
            "The Pursuit of Happyness",
            "Seven Pounds",
            "Capote",
            "The Truman Show",
            "Dances with Wolves"};
    
}
