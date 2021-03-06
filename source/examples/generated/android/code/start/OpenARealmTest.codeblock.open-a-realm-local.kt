val config = RealmConfiguration.Builder()
    .allowQueriesOnUiThread(true)
    .allowWritesOnUiThread(true)
    .build()
val realm = Realm.getInstance(config)
Log.v("EXAMPLE", "Successfully opened a realm at: " + realm.path)
