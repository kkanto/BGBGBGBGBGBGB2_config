 
listView('BGBGBGBGBGBGB2 Jobs') {
    description('BGBGBGBGBGBGB2 Jobs')
    jobs {
        regex('BGBGBGBGBGBGB2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
