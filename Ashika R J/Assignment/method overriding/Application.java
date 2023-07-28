class DefaultApp extends Application
{
 void mobApp()
 {
 System.out.println("Default_App = settings");
 }
}

class InstalledApp extends Application
{
 void mobApp()
 {
 System.out.println("Installed_App = whatsapp");
 }
}

class Application
{
 void mobApp()
 {
 System.out.println("Applications");
 }
 public static void main(String a[])
 {
  DefaultApp App=new DefaultApp();
  App.mobApp();
  Application Apps=new InstalledApp();
  Apps.mobApp();
 }
}
