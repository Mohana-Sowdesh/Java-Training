package creationalpattern;

interface TV {
	void switchChannel();
}

public class FactoryPattern {
	public static void main(String[] args) {
		TVService tvService = new TVService();
		TV tv = tvService.initiateSwitchChannel("VijayTV");
		tv.switchChannel();
	}
}

class TVService {
	public TV initiateSwitchChannel(String tvChannel) {
		if(tvChannel == null || tvChannel.isEmpty())
			return null;
		switch(tvChannel) {
			case "SunTV":
				return new SunTV();
			case "VijayTV":
				return new VijayTV();
			case "NatGeoTV":
				return new NatGeoTV();
			case "DiscoveryTV":
				return new DiscoveryTV();
			default:
	            throw new IllegalArgumentException("Unrecognized TV channel "+ tvChannel);
		}
 	}
}

class SunTV implements TV {
	@Override
	public void switchChannel() {
		System.out.println("Switched to Sun TV...");
	}
}

class VijayTV implements TV {
	@Override
	public void switchChannel() {
		System.out.println("Switched to Vijay TV...");
	}
}

class NatGeoTV implements TV {
	@Override
	public void switchChannel() {
		System.out.println("Switched to National Geography TV...");
	}
}

class DiscoveryTV implements TV {
	@Override
	public void switchChannel() {
		System.out.println("Switched to Discovery TV...");
	}
}