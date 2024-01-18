[#ftl]

[@c.page title="${post.title}"]
    <h1>${post.title}</h1>
    ${post.body?no_esc}
    <p><a href="/">Back to Post List</a></p>
[/@c.page]