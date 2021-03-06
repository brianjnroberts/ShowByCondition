// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rpoboxconfigurator.proxies;

public enum Status
{
	Vacant(new java.lang.String[][] { new java.lang.String[] { "en_US", "Vacant" } }),
	Rented(new java.lang.String[][] { new java.lang.String[] { "en_US", "Rented" } }),
	Broken_but_Rented(new java.lang.String[][] { new java.lang.String[] { "en_US", "Broken but Rented" } }),
	Parcel_Locker(new java.lang.String[][] { new java.lang.String[] { "en_US", "Parcel Locker" }, new java.lang.String[] { "fr_CA", "Armoire à colis" } }),
	Parcel_Locker_Key_Return(new java.lang.String[][] { new java.lang.String[] { "en_US", "Parcel Locker Key Return" }, new java.lang.String[] { "fr_CA", "Retour clé d'armoir à colis" } }),
	Waiting_for_Keys___Unavailable(new java.lang.String[][] { new java.lang.String[] { "en_US", "Waiting for Keys - Unavailable" } }),
	Waiting_for_Lock_Change___Unavailable(new java.lang.String[][] { new java.lang.String[] { "en_US", "Waiting for Lock Change - Unavailable" } }),
	Box_Cannot_be_Repaired___Unavailable(new java.lang.String[][] { new java.lang.String[] { "en_US", "Box Cannot be Repaired - Unavailable" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Status(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
