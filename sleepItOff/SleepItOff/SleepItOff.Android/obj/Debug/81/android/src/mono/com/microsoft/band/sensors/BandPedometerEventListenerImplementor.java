package mono.com.microsoft.band.sensors;


public class BandPedometerEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.microsoft.band.sensors.BandPedometerEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBandPedometerChanged:(Lcom/microsoft/band/sensors/BandPedometerEvent;)V:GetOnBandPedometerChanged_Lcom_microsoft_band_sensors_BandPedometerEvent_Handler:Microsoft.Band.Sensors.IBandPedometerEventListenerInvoker, Microsoft.Band.Android\n" +
			"";
		mono.android.Runtime.register ("Microsoft.Band.Sensors.IBandPedometerEventListenerImplementor, Microsoft.Band.Android", BandPedometerEventListenerImplementor.class, __md_methods);
	}


	public BandPedometerEventListenerImplementor ()
	{
		super ();
		if (getClass () == BandPedometerEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Microsoft.Band.Sensors.IBandPedometerEventListenerImplementor, Microsoft.Band.Android", "", this, new java.lang.Object[] {  });
	}


	public void onBandPedometerChanged (com.microsoft.band.sensors.BandPedometerEvent p0)
	{
		n_onBandPedometerChanged (p0);
	}

	private native void n_onBandPedometerChanged (com.microsoft.band.sensors.BandPedometerEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
