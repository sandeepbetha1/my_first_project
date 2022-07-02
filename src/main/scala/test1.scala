import org.apache.spark.sql.SparkSession

object test1 {
  def main(args: Array[String]): Unit ={

    val spark = SparkSession.builder()
      .appName("first1")
      .master("local")
      .getOrCreate()

    val df = spark.read.csv("D:\\bigdata\\covid_19_india.csv")

    df.show()

  }
}
