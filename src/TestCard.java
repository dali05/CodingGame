import java.util.*;

public class TestCard {

    enum CardColor{
        Spade, Diamond, Club, Heart
    }

    enum CardValue{
        Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
    }

    class GameException extends RuntimeException{
    }

    class Card{
        public final CardColor color;
        public final CardValue value;
        public Card(CardColor cardColor, CardValue cardValue){
            color = cardColor;
            value = cardValue;
        }
    }

    class Deck {
        public ArrayList<Card> cards;
        public int getCardsCount() {
            return cards == null ? 0 : cards.size();
        }
        public Deck(int cardsCount){
            if(cardsCount % 4 != 0)
                throw new GameException();
            cards = new ArrayList<>(cardsCount);
            addCards(cardsCount);
        }
        private void addCards(int cardsToAdd){
            int cardsAdded = 0;
            while(cardsAdded < cardsToAdd)
                for(CardColor cardColor : CardColor.values())
                    for(CardValue cardValue : CardValue.values()){
                        if(cardsAdded >= cardsToAdd)
                            break;
                        cards.add(new Card(cardColor, cardValue));
                        ++cardsAdded;
                    }
        }
        public void shuffle(){
            Collections.shuffle(cards);
        }
    }

    class Player{
        private String _name;
        public Set<Card> cards = new TreeSet<Card>();
        public int getCardsCount(){
            return cards == null ? 0 : cards.size();
        }
        public Player(String name){
            _name=name;
        }
        public void addCard(Card card){
            cards.add(card);
        }
    }

    class Game{
        private int _cardsCount;
        private int _playersCount;
        public Deck deck;
        public List<Player> players;

        public int getPlayersCount(){
            return players == null ? 0 : players.size();
        }

        public Game(int playersCount, int cardsCount){
            _playersCount = playersCount;
            _cardsCount = cardsCount;
            players = newListPlayer(playersCount);
            deck = new Deck(cardsCount);
        }

        public void distributeCardsEventlyToPlayers(){
            for(Card card : deck.cards){
                players.get((int)(Math.random()*4)).addCard(card);
            }
        }
        private List<Player> newListPlayer(int playersCount){
            List<Player> playersList = new ArrayList<Player>(playersCount);
            return playersList;
        }

        public void start(){
            deck.shuffle();
            distributeCardsEventlyToPlayers();
        }
    }
}
