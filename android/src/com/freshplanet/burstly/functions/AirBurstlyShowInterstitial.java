//////////////////////////////////////////////////////////////////////////////////////
//
//  Copyright 2012 Freshplanet (http://freshplanet.com | opensource@freshplanet.com)
//  
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//  
//    http://www.apache.org/licenses/LICENSE-2.0
//  
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//  
//////////////////////////////////////////////////////////////////////////////////////

package com.freshplanet.burstly.functions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;
import com.freshplanet.burstly.Extension;

public class AirBurstlyShowInterstitial implements FREFunction
{
	@Override
	public FREObject call(FREContext context, FREObject[] args)
	{
		String additionalZoneId = null;
		if (args != null && args.length > 0)
		{
			try {
				additionalZoneId = args[0].getAsString();
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (FRETypeMismatchException e) {
				e.printStackTrace();
			} catch (FREInvalidObjectException e) {
				e.printStackTrace();
			} catch (FREWrongThreadException e) {
				e.printStackTrace();
			}
		}
		
		if (additionalZoneId != null)
		{
			Extension.context.showInterstitial(additionalZoneId);
		} else
		{
			Extension.context.showInterstitial();
		}

		return null;
	}

}
