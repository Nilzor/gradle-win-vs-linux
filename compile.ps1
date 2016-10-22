md javac_out 2>&1 > $null
$res = Measure-Command {javac src/main/java/com/example/*.java src/main/java/com/example/gen/*.java -d javac_out} 
Echo ($res.TotalSeconds.ToString() + "s")