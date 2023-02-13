# v12_Intents
Completed the whole concept till v12
Showcasing the use of intents 

within same app --> Explicit Intent
``` 
val web = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.____"))
            startActivity(web)
```
your app to another ==> Implicit Intetnt
```
val callIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"93011122334"))
          startActivity(callIntent)
```

Adding video for the same



https://user-images.githubusercontent.com/52217208/218351589-33da74e9-a0d1-4673-8d83-925d41db63cc.mp4



