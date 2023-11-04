# Give me a star if you love this repo!

<img width="757" alt="image" src="https://github.com/madhusudhankonda/elasticsearch-in-action/assets/1698230/399df16e-27c8-4fc3-9cd1-305ae320006a">


# elasticsearch-in-action
[Elasticsearch in Action (second edition) Book](https://www.manning.com/books/elasticsearch-in-action-second-edition?utm_source=mkonda&utm_medium=affiliate&utm_campaign=book_konda_elasticsearch_7_23_21&a_aid=mkonda&a_bid=edbc50d4)

The [book's accompanying wiki pages](https://github.com/madhusudhankonda/elasticsearch-in-action/wiki) explains the code examples 

Here's the TOC

1. Overview
2. [Getting Started](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/babeea237dcc77f1d74f734e750347420e64ddc3/kibana_scripts/ch02_getting_started.txt)
3. [Architecture](https://github.com/madhusudhankonda/elasticsearch-in-action/wiki/Ch-3:-Architecture)
4. [Mapping](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch04_mapping.txt)
5. [Working with Documents](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch05_working_with_documents.txt)
6. [Indexing Operations](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch06_indexing_operations.txt)
7. [Text Analysis](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch07_text_analysis.txt)
8. [Search Basics](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch08_search_basics.txt)
9. [Term Level Queries](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch09_term_level_queries.txt)
10. [Full Text Queries](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch10_full_text_queries.txt)
11. [Compound Queries](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch11_compound_queries.txt)
12. [Advanced Queries](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch12_advanced_queries.txt)
13. [Aggregations](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch13_aggregations.txt)
14. [Administration](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch14_administration.txt)
15. [Performance and Troubleshooting](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/ch_15_performance_and_trouble_shooting.txt)
16. [Appendix A: Installing and configuring Elasticsearch and Kibana](https://github.com/madhusudhankonda/elasticsearch-in-action/wiki/Appendix-A:-Installation)
17. [Appendix B: Ingest Pipelines](https://github.com/madhusudhankonda/elasticsearch-in-action/blob/561c45d7991e8a1766a98ba1a58b0f0d836fc1fd/kibana_scripts/appendix_ingest_pipelines.txt)

## Disabling XPack Security for 8.x
By default, 8.x version of Elasticsearch comes with security enabled. For simplicity and not getting the security in our way, we can disable the feature

> :warning: **PLEASE DO NOT disable security in PRODUCTION**

Edit config/elasticsearch.yml to add the following property at the end of the file:
```xpack.security.enabled: false```
