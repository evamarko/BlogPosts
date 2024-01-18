[#ftl]

[@c.page title="Post List"]
    <h1>Post List</h1>
    [#list posts.content]
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Title</th>
                <th scope="col">Best Quote</th>
                <th scope="col">Published</th>
                <th scope="col">Author</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            [#items as post]
                <tr>
                    [#if post.published??]
                        <td>${post.title}</td>
                        <td>${post.perex?no_esc}</td>
                        <td>${post.published?date}</td>
                        <td>${post.author}</td>
                        <td><a href="/post/${post.slug}">More Quotes</a></td>
                    [/#if]
                </tr>
            [/#items]
            </tbody>
        </table>
    [#else]
        <p class="fst-italic">Post List is empty.</p>
    [/#list]
[/@c.page]


