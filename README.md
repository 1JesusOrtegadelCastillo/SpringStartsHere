Changes:

Added 2 new Beans into ProjectConfig just to understand that Spring will also manage them.
When you call those methods from the main class, an explicit casting is not needed since Spring
looks for a Bean of the type you requested in its context. If a Bean does not exists, Spring
will throw an Exception.
