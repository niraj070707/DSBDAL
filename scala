val input = sc.textFile("words.txt")
val words = input.flatMap(x=>x.split(" "))
val counts = words.map(x => (x,1))
val reducounts = counts.reduceByKey((x,y) => x+1)
reducounts.saveAsTextFile("output.txt")
reducounts.foreach(println)
