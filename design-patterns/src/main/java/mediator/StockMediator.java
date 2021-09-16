package mediator;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator{

    private List<Colleague> colleagues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSaleOffers;

    private int colleagueCodes = 0;

    public StockMediator(){
        colleagues = new ArrayList<>();
        stockBuyOffers = new ArrayList<>();
        stockSaleOffers = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague newColleague){
        colleagues.add(newColleague);
        colleagueCodes++;
        newColleague.setCollCode(colleagueCodes);
    }

    @Override
    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;
        for(StockOffer offer: stockBuyOffers){
            if((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)){
                System.out.println(shares + " shares of " + stock +
                        " sold to colleague code " + offer.getCollCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if(stockSold){ break; }
        }
        if(!stockSold) {
            System.out.println(shares + " shares of " + stock +
                    " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockSaleOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;
        for(StockOffer offer: stockSaleOffers){
            if((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)){
                System.out.println(shares + " shares of " + stock +
                        " bought by colleague code " + offer.getCollCode());
                stockSaleOffers.remove(offer);
                stockBought = true;
            }
            if(stockBought){ break; }
        }
        if(!stockBought) {
            System.out.println(shares + " shares of " + stock +
                    " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockBuyOffers.add(newOffering);
        }

    }

    public void getStockOfferings(){
        System.out.println("\nStocks for Sale");
        for(StockOffer offer: stockSaleOffers){
            System.out.println(offer.getstockShares() + " of " + offer.getStockSymbol());
        }
        System.out.println("\nStock Buy Offers");
        for(StockOffer offer: stockBuyOffers){
            System.out.println(offer.getstockShares() + " of " + offer.getStockSymbol());
        }
    }

}
