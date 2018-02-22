package hello;

import java.util.Scanner;

public class CryptoCurrencyController {

    DataRetriever dataRetriever;
    DataDisplay dataDisplay;

    public CryptoCurrencyController(DataRetriever dataRetriever, DataDisplay dataDisplay) {
        this.dataRetriever = dataRetriever;
        this.dataDisplay = dataDisplay;
    }

    public void getData() {
        dataRetriever.start();
    }

    public void displayData() {
        dataDisplay.start();
    }


    public String getCommand(){
        System.out.println("Write command [add,remove] : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void handleMenu(){
        while (true){
            String command = getCommand();
            if(command.equals("add")){
                addToTrack();
            }
            if(command.equals("remove")){
                removeFromTrack();
            }
        }
    }


    public void addToTrack(){
        CryptoCurrencyRepository.getCryptoCurrencies().stream().map(x -> x.getId()).forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select cryptocurrency:");
        String selected = scanner.nextLine();

        for (String currency : selected.split(",")){
            System.out.println(currency);
            if(CryptoCurrencyRepository
                    .getCryptoCurrencies()
                    .stream().map(x -> x.getId())
                    .filter( data -> data.contains(currency))
                    .findFirst()
                    .orElse(null) != null)
                CryptoCurrencyRepository.getTracksCryptocurrencies().add(currency);
        }
    }

    public void removeFromTrack(){
        Scanner scanner = new Scanner(System.in);
        String toRemove = scanner.next();
        CryptoCurrencyRepository.getTracksCryptocurrencies().stream().forEach(System.out::println);
        System.out.println("Select to remove");

        if(CryptoCurrencyRepository
                .getTracksCryptocurrencies()
                .stream()
                .filter(x -> x.contains(toRemove))
                .findFirst().orElse(null)!=null){
            CryptoCurrencyRepository.getTracksCryptocurrencies().remove(toRemove);
        }
    }
}
