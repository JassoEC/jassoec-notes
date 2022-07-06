<h1>Listado de post</h1>
<table class="table">
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Content</th>
            <th colspan="2">&nbsp;</th>
        </tr>
    </thead>
    <tbody>
        @foreach ($posts as $post)
        <tr>
            <td>{{$post->id}}</td>
            <td>{{$post->title}}</td>
            <td>{{$post->body}}</td>
            <td>
                <button class="btn btn-primary" wire:click="edit({{$post->id}})">Edit</button>
            </td>
            <td>
                <button class="btn btn-danger" wire:click="delete({{$post->id}})">Eliminar</button>
            </td>
        </tr>
        @endforeach
    </tbody>
</table>

{{$posts->links()}}