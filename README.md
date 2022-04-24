It's comfortable to let Spring build and set the dependencies to the objects of your application. Letting Spring do this job for you 
saves you from writing a bunch of lines of code and makes the app easier to read and understand. But Spring can also get confused in 
some cases. A scenario often encountered in practice is generating a circular dependency by mistake. 

A Circular Dependency is a situation in which, to create a bean (let's name it "Bean A"), Spring needs to inject another bean that 
doesn't exist yet ("Bean B"). But Bean B also requests a dependency to Bean A. So, to create Bean B, Spring needs first to have Bean A. 
Spring is now in a deadlock. It cannot create Bean A because it needs Bean B, and it cannot create Bean B because it needs Bean A.

A circular dependency is easy to avoid. You just need to make sure you don't define objects whose creation depends on the other. 
Having dependencies from one object to another like this is a bad design of classes. In such case, you need to rewrite your code.
