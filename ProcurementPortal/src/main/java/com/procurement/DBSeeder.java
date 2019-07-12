package com.procurement;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.procurement.bidding.model.Bidding;
import com.procurement.bidding.repository.BiddingRepository;

@Component
public class DBSeeder implements CommandLineRunner {
	private BiddingRepository biddingRepository;
	
	public DBSeeder(BiddingRepository biddingRepository) {
		this.biddingRepository=biddingRepository;
	}
	
	
	@Override
	public void run(String...string) throws Exception{
		Bidding Bid1 = new Bidding("aaa", "bbb", "Truck", 10, 10, 100,"ccc", "10-10-2019");
		Bidding Bid2 = new Bidding("ddd", "eee", "Crane", 10, 10, 100,"fff", "10-10-2019");
		Bidding Bid3 = new Bidding("ggg", "hhh", "JCB", 10, 10, 100,"iii", "10-10-2019");
		Bidding Bid4 = new Bidding("jjj", "kkk", "Car", 10, 10, 100,"lll", "10-10-2019");
		//drop all hotel
		this.biddingRepository.deleteAll();
		List<Bidding> bids = Arrays.asList(Bid1, Bid2, Bid3, Bid4);
		this.biddingRepository.saveAll(bids);

	}
	
}
