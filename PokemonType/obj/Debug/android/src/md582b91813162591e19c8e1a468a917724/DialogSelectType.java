package md582b91813162591e19c8e1a468a917724;


public class DialogSelectType
	extends android.app.DialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onDismiss:(Landroid/content/DialogInterface;)V:GetOnDismiss_Landroid_content_DialogInterface_Handler\n" +
			"";
		mono.android.Runtime.register ("PokemonType.DialogSelectType, PokemonType, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DialogSelectType.class, __md_methods);
	}


	public DialogSelectType () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DialogSelectType.class)
			mono.android.TypeManager.Activate ("PokemonType.DialogSelectType, PokemonType, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public DialogSelectType (android.content.Context p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == DialogSelectType.class)
			mono.android.TypeManager.Activate ("PokemonType.DialogSelectType, PokemonType, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onDismiss (android.content.DialogInterface p0)
	{
		n_onDismiss (p0);
	}

	private native void n_onDismiss (android.content.DialogInterface p0);

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
