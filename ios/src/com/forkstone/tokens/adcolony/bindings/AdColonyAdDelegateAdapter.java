
package com.forkstone.tokens.adcolony.bindings;

import org.robovm.apple.foundation.NSObject;

public class AdColonyAdDelegateAdapter extends NSObject implements AdColonyAdDelegate {
	@Override
	public void onAdStartedInZone (String zoneID) {
	}

	@Override
	public void onAdAttemptFinished (boolean shown, String zoneID) {
	}
}
