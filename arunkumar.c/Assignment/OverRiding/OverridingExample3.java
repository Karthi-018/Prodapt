class Mobile{
	void openApp(){
		System.out.println("Opening mobile app");
	}
}

class IOS extends Mobile{
	void openApp(){
		System.out.println("Opening IOS mobile app");
	}
}

class Android extends Mobile{
	void openApp(){
		System.out.println("Opening ANDROID mobile app");
	}
}

class RealMe extends Android{
	void openApp(){
		System.out.println("Opening Realme app");
	}
}

class Redmi extends Android{
	void openApp(){
		System.out.println("Opening Redmi app");
	}
}

class X extends IOS{
	void openApp(){
		System.out.println("Opening Iphone X app");
	}
}

class XR extends IOS{
	void openApp(){
		System.out.println("Opening Iphone XR app");
	}
} 

class OverridingExample3{
	XR xr = new XR();
	xr.openApp();
	Redmi redmi = new Redmi();
	redmi.openApp();
}